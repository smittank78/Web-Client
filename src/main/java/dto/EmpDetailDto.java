package dto;

public class EmpDetailDto 
{
	
	private int edEid;
	private int edDid;
	private int edId;
	private int edLid;
	
	private EmpDepartmentDto departmentDto;
	private EmpProgramLanguageDto languageDto;
	
	public int getEdDid() {
		return edDid;
	}
	public void setEdDid(int edDid) {
		this.edDid = edDid;
	}
	public int getEdId() {
		return edId;
	}
	public int getEdLid() {
		return edLid;
	}
	public void setEdLid(int edLid) {
		this.edLid = edLid;
	}
	public void setEdId(int edId) {
		this.edId = edId;
	}
	public int getEdEid() {
		return edEid;
	}
	public void setEdEid(int edEid) {
		this.edEid = edEid;
	}
	public EmpDepartmentDto getDepartmentDto() {
		return departmentDto;
	}
	public void setDepartmentDto(EmpDepartmentDto departmentDto) {
		this.departmentDto = departmentDto;
	}

	public EmpProgramLanguageDto getLanguageDto() {
		return languageDto;
	}
	public void setLanguageDto(EmpProgramLanguageDto languageDto) {
		this.languageDto = languageDto;
	}
	@Override
	public String toString() {
		return "EmpDetailDto [edId=" + edId + " ,edEid=" + edEid +  "edDid=" + edDid +  ", edLid=" + edLid
				+ ", departmentDto=" + departmentDto +  ", languageDto="  + languageDto + "]";
	}
}