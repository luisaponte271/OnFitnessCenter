package pe.edu.cibertec.jsf.listener;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class ListenerFases
	implements PhaseListener {

	private static final long serialVersionUID = 1L;

	@Override
	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;
	}

	@Override
	public void beforePhase(PhaseEvent event) {
		System.out.println("Antes de la fase "
				+ event.getPhaseId().getName());
	}

	@Override
	public void afterPhase(PhaseEvent event) {
		System.out.println("Después de la fase "
				+ event.getPhaseId().getName());
	}
}
