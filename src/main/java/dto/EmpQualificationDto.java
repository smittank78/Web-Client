package dto;

public class EmpQualificationDto 
{
	private int id;
	private String qQlfy;
	private boolean qActive;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getqQlfy() {
		return qQlfy;
	}
	public void setqQlfy(String qQlfy) {
		this.qQlfy = qQlfy;
	}
	public boolean isqActive() {
		return qActive;
	}
	public void setqActive(boolean qActive) {
		this.qActive = qActive;
	}
	@Override
	public String toString() {
		return "EmpQualificationDto [id=" + id + ", qQlfy=" + qQlfy + ", qActive=" + qActive + "]";
	}
	
}