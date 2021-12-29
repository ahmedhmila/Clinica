package Patient;

public class RPatient extends Patient {
	RPatient r = new RPatient();
	Patient OldPatient=r;
	
	
	
	
	public Patient getOldPatient() {
		return OldPatient;
	}
	public void setOldPatient(Patient oldPatient) {
		OldPatient = oldPatient;
	}

}
