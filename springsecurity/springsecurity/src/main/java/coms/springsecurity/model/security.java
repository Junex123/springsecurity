package coms.springsecurity.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class security {

	@Id
	private int id;
	private String username;
	private String password;
	private String title;
	private String category;
    private String roles;

    
    
    

	

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
    
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "security [id=" + id + ", username=" + username + ", password=" + password + ", title=" + title
				+ ", category=" + category + ", roles=" + roles + "]";
	}

	
	


    
}
