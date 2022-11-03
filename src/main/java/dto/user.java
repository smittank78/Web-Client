package dto;

public class user {
	private int id;
	private String username;
	public int getId() {
		return id;
	}
	public String getUsername() {
		return username;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "UserDto [id=" + id + ", username=" + username + "]";
	}
	
}
