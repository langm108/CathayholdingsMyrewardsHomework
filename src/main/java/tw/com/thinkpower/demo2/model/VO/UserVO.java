package tw.com.thinkpower.demo2.model.VO;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class UserVO {

	public UserVO() {
		// TODO Auto-generated constructor stub
	}
	    
	private Long userSeq;
	
	@NotBlank(message = "姓名不能為空")
	private String userName;


	private String password;
	
	 @NotBlank(message = "年齡不能為空")
	 @Pattern(regexp = "^[0-9]{1,2}$",message="年齡不正確")
	 private String age;

	 
	 @Email
	 private String email;


	public Long getUserSeq() {
		return userSeq;
	}


	public void setUserSeq(Long userSeq) {
		this.userSeq = userSeq;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "User [userSeq=" + userSeq + ", userName=" + userName + ", password=" + password + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + ((userSeq == null) ? 0 : userSeq.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserVO other = (UserVO) obj;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (userSeq == null) {
			if (other.userSeq != null)
				return false;
		} else if (!userSeq.equals(other.userSeq))
			return false;
		return true;
	}



}
