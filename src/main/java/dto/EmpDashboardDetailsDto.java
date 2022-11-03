package dto;

import java.util.List;
import java.util.Map;

public class EmpDashboardDetailsDto
{
	private int eId;
	private String eName;
	private int ePhone;
	private String eCity;
	
/*	private List<String> department;
	private List<String> language;
*/	
	private List<Map<String,String>> department;
	
	private String qQlfy;

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public int getePhone() {
		return ePhone;
	}

	public void setePhone(int ePhone) {
		this.ePhone = ePhone;
	}

	public String geteCity() {
		return eCity;
	}

	public void seteCity(String eCity) {
		this.eCity = eCity;
	}

	public List<Map<String, String>> getDepartment() {
		return department;
	}

	public void setDepartment(List<Map<String, String>> department) {
		this.department = department;
	}

	public String getqQlfy() {
		return qQlfy;
	}

	public void setqQlfy(String qQlfy) {
		this.qQlfy = qQlfy;
	}

	@Override
	public String toString() {
		return "EmpDashboardDetailsDto [eId=" + eId + ", eName=" + eName + ", ePhone=" + ePhone + ", eCity=" + eCity
				 + ", qQlfy=" + qQlfy + "]";
	}

	
}