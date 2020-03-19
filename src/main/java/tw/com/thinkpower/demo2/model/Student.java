package tw.com.thinkpower.demo2.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "學生資料")
public class Student {
	

	public Student() {
		// TODO Auto-generated constructor stub
	}

    @ApiModelProperty(value = "學生姓名",required = true)
    private String name;

    @ApiModelProperty(value = "學生編號",required = true)
    private Integer no;

    @ApiModelProperty(value = "學生年齡",required = true)
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    
}