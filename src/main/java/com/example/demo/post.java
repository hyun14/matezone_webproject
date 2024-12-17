public class post {
    private int post_id;
    private String user_id;
    private String title;
    private String img;
    private String created_at;
    private String updated_at;
    private String content;

	public int getPost_id() {
		return this.post_id;
	}

	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}

	public String getUser_id() {
		return this.user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImg() {
		return this.img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getCreated_at() {
		return this.created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getUpdated_at() {
		return this.updated_at;
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}