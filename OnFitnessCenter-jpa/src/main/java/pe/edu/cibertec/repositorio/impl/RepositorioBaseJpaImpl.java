package pe.edu.cibertec.repositorio.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import pe.edu.cibertec.dominio.Entidad;
import pe.edu.cibertec.repositorio.Repositorio;

public abstract class RepositorioBaseJpaImpl<E extends Entidad>
	implements Repositorio<E> {

	protected EntityManager em;
	protected Class<E> claseEntidad;

	@SuppressWarnings("unchecked")
	public RepositorioBaseJpaImpl(EntityManager em) {
		this.em = em;
		Type type = getClass().getGenericSuperclass();
        while (!(type instanceof ParameterizedType)
        		|| ((ParameterizedType) type).getRawType()
        				!= RepositorioBaseJpaImpl.class) {
            if (type instanceof ParameterizedType) {
                type = ((Class<?>) ((ParameterizedType) type).getRawType())
                		.getGenericSuperclass();
            } else {
                type = ((Class<?>) type).getGenericSuperclass();
            }
        }
        this.claseEntidad = (Class<E>) ((ParameterizedType) type)
        		.getActualTypeArguments()[0];
	}

	@Override
	public void agregar(E entidad) {
		em.persist(entidad); //CREATE
	}

	@Override
	public List<E> obtenerTodos() {
		CriteriaBuilder cb = em.getCriteriaBuilder();  
        CriteriaQuery<E> query = cb.createQuery(claseEntidad);
        Root<E> root = query.from(claseEntidad);
        return em.createQuery(query.select(root)).getResultList();
	}

	@Override
	public E obtenerPorId(Integer id) {
		return em.find(claseEntidad, id);
	}

	@Override
	public void actualizar(E entidad) {
		em.merge(entidad);
	}

	@Override
	public void eliminar(Integer id) {
		E entidad = obtenerPorId(id);
		if (entidad != null) {
			em.remove(entidad);
		}
	}
}
