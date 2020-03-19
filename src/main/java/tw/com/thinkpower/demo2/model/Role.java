package tw.com.thinkpower.demo2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity(name = "role")
public class Role {

	public Role() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "role_seq")
	private Long sequence;
	
	@Column(name = "user _seq")
	private String name;


	@Column(name = "role _name")
	private String unitId;


	public Long getSequence() {
		return sequence;
	}


	public void setSequence(Long sequence) {
		this.sequence = sequence;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getUnitId() {
		return unitId;
	}


	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}


	@Override
	public String toString() {
		return "Role [sequence=" + sequence + ", name=" + name + ", unitId=" + unitId + "]";
	}
	

}
