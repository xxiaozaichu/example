package first;

import zcu.xutil.web.Validator;

public class User {
	
	protected String username;
	
	protected String password;
	
	@Validator(value = ".+", message = "can't empty")
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Validator(value = ".+", message = "can't empty")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


}
