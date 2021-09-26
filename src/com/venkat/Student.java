package com.venkat;

import java.util.Objects;

public class Student {
	private int stId;
	private String stName;
	public int getStId() {
		return stId;
	}
	public void setStId(int stId) {
		this.stId = stId;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public Student(int stId, String stName) {
		super();
		this.stId = stId;
		this.stName = stName;
	}
	@Override
	public int hashCode() {
		return Objects.hash(stId, stName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return stId == other.stId && Objects.equals(stName, other.stName);
	}
	
	

}
