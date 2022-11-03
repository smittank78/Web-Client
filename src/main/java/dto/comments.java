package dto;

public class comments
{
	private int id;
	private String body;
	private int postId;
	private user user;
	public int getId() {
		return id;
	}
	public int getPostId() {
		return postId;
	}
	public String getBody() {
		return body;
	}
	public user getUser() {
		return user;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public void setUser(user user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "DumyCommentDto [id=" + id + ", postId=" + postId + ", body=" + body + ", user=" + user + "]";
	}
	
	
}