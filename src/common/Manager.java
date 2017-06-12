package common;

public class Manager extends Employee{
	Employee secretary;
	
	public Manager(String name, double salary, int hire_year, int hire_month, int hire_day) {
		super(name, salary, hire_year, hire_month, hire_day);
	}
	
	public void setSecretary(Employee sec) {
		secretary = sec;
	}
}
