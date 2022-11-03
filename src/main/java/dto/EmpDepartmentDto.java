package dto;

public class EmpDepartmentDto 
{
	private int id;
	private String dTech;
	private boolean dActive;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getdTech() {
		return dTech;
	}
	public void setdTech(String dTech) {
		this.dTech = dTech;
	}
	public boolean isdActive() {
		return dActive;
	}
	public void setdActive(boolean dActive) {
		this.dActive = dActive;
	}
	@Override
	public String toString() {
		return "EmpDepartmentDto [id=" + id + ", dTech=" + dTech + ", dActive=" + dActive + "]";
	}
		
}