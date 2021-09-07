package com.lms.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long CID;
	
	@Column(name="courseName")
	private String courseName;
	
	@Column(name="duration")
	private String duration;
	
	@Column(name="price")
	private String price;
	
	@ManyToOne()
	@JoinColumn(name="faculty_id")
	private Faculty faculty;
	
	public Long getCID() {
		return CID;
	}

	public void setCID(Long cID) {
		CID = cID;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	
	
	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	public Course(Long cID, String courseName, String duration, String price, Faculty faculty) {
		super();
		CID = cID;
		this.courseName = courseName;
		this.duration = duration;
		this.price = price;
		this.faculty = faculty;
	}

	public Course() {
		super();
	}

	

	

}
