package top.home.hyywk.entity;

public class User {
	private String username;
	private String passwd;
	private String name;
	
	public User() {}

	
	
	public User(String username, String passwd, String name) {
		super();
		this.username = username;
		this.passwd = passwd;
		this.name = name;
	}



	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
