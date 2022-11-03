package dto;

public class EmpProgramLanguageDto 
{
	private int id;
	private String language;
	private boolean active;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	@Override
	public String toString() {
		return "EmpProgramLanguageDto [id=" + id + ", language=" + language + ", active=" + active + "]";
	}
	
}