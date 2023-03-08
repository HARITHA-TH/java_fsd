package javainterface;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployee{
	private int EmpId;
	public String EmpName;
	public double salary;
	public SortEmployee(int empId, String empName, double salary) {
		
		EmpId = empId;
		EmpName = empName;
		this.salary = salary;
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}

