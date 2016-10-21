package com.rajesh.ComparableComparator;

public class CompareToExmample1 implements Comparable <CompareToExmample1> {
	private int id;
	private String name;
	private String className;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	
public int compareTo(CompareToExmample1 otherCompareToExmample1){
	if(this.id == otherCompareToExmample1.getId()) {  
		return 0;  
	} else if(this.id > otherCompareToExmample1.getId()) {  
		return 1;  
	} else {  
		return -1;  
	}  
	
}

}
