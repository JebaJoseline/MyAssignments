package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
	  	  System.out.println("Student Name :Part of Student");
	    }
	public void studentDept() {
	  	  System.out.println("Student Department :Part of Student");
	    }
	public void studentId() {
	  	  System.out.println("Student Id :Part of Student");
	    }

	public static void main(String[] args) {
		System.out.println("Calling all the methods from Student,Department& College by Multi level Inheritance");
		Student ss=new Student();
		ss.collegeName();
		ss.collegeCode();
		ss.collegeRank();
		ss.deptName();
		ss.studentName();
		ss.studentId();
		ss.studentDept();

	}

}
