package com.ravi.divi.reference;

public class ReferenceMaintaner {

	public static void main(String[] args) {
		
		gettersSetterClassEmp gsEmp = new gettersSetterClassEmp();
		
		gsEmp.setEmpName("Mohit FNU");
		gsEmp.setEmpId(1235);
		gsEmp.setEmpNo(252);;
		gsEmp.takeBack(1, 8);
		
		System.out.println("========="+gsEmp.c);
		
		System.out.println("BOFA Employee" +gsEmp.getEmpName()+ "'s Account " +gsEmp.getEmpId());

	}

}
