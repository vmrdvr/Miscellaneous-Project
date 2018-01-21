package com.ravi.divi.reference;

import java.util.Map;

public class gettersSetterClassEmp implements RAVInterface  {
	
	

	
	private String empName ;
	private int empId ,empNo;
	public int a,b,c,d;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
       return empId;
}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public Object takeBack(int a , int b) {
c = a+b ;
		return c;
	}
	
	
	public Object connect() {
		// TODO Auto-generated method stub
		return null;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public Object takeBack() {
		// TODO Auto-generated method stub
		return null;
	}
	
	


}
