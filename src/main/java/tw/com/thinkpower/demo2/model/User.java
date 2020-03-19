package tw.com.thinkpower.demo2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity(name = "user")
public class User {

	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String userName, String password) {
		
		this.userName = userName;
		this.password = password;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_seq")
	private Long userSeq;
	
	@Column(name = "user_name")
	private String userName;


	@Column(name = "password")
	private String password;


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
		User other = (User) obj;
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
