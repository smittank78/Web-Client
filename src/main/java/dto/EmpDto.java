package dto;

import java.util.List;

@SuppressWarnings("unused")
public class EmpDto 
{
	private static int counter = 0;
	private int eId;
	private String eName;
	private int ePhone;
	private String eCity;
	private boolean eActive;
	private List<EmpDetailDto> detailDto;
	
	private EmpQualificationDto qualificationDto;
	
	public void seteId(int eId) {
		this.eId = eId;
		this.detailDto.forEach(d -> d.setEdEid(this.eId));
	}
	public int geteId() {
		return eId;
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
	public boolean iseActive() {
		return eActive;
	}
	public void seteActive(boolean eActive) {
		this.eActive = eActive;
	}	
	public EmpQualificationDto getQualificationDto() {
		return qualificationDto;
	}
	public void setQualificationDto(EmpQualificationDto qualificationDto) {
		this.qualificationDto = qualificationDto;
	}	

	public List<EmpDetailDto> getDetailDto() {
		return detailDto;
	}
	public void setDetailDto(List<EmpDetailDto> detailDto) {
		this.detailDto = detailDto;
	}
	@Override
	public String toString() {
		return "EmpDto [ eId=" + eId + ", eName=" + eName + ", ePhone=" + ePhone + ", eCity="
				+ eCity + ", eActive=" + eActive +" , "  + qualificationDto.toString() +"]";
	}	
}