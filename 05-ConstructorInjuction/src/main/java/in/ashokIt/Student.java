package in.ashokIt;

import java.util.List;
import java.util.Map;
import java.util.Set;
public class Student {
	private Integer id;
	private String name;
	private List<String> course;
	private Set<String> hobbies;
    private Map<String,String>phno;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getCourse() {
		return course;
	}
	public void setCourse(List<String> course) {
		this.course = course;
	}
	public Set<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(Set<String> hobbies) {
		this.hobbies = hobbies;
	}
	public Map<String, String> getPhno() {
		return phno;
	}
	public void setPhno(Map<String, String> phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + ", hobbies=" + hobbies + ", phno=" + phno
				+ "]";
	}
    
	

}
