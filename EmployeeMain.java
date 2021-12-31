package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee {
	private int empno;
	private String ename;
	private int salary;
	
	public Employee(int empno, String ename, int salary) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.salary = salary;
	}
	public int getEmpno() {
		return empno;
	}
	public String getEname() {
		return ename;
	}
	public int getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", salary=" + salary + "]";
	}
	
}

public class EmployeeMain {

	public static void main(String[] args) {
List<Employee> c=new ArrayList<Employee>();
Scanner s=new Scanner(System.in);
Scanner s1=new Scanner(System.in);
int ch;
do {
	System.out.println("1.INSERT");
	System.out.println("2.DISPLAY");
	System.out.println("enter your choice");
	ch=s.nextInt();
	switch(ch) {
	case 1:
		System.out.println("enter empno");
		int empno=s.nextInt();
		System.out.println("enter employee name");
		String ename=s1.nextLine();
		
		System.out.println("enter salary");
		int salary=s.nextInt();
		
		c.add(new Employee(empno,ename,salary));
		System.out.println(c);
		break;
	}

	}while(ch!=0);

}
}
