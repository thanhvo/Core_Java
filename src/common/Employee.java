package common;

import java.io.*;
import java.util.*;
import stream.*;

public class Employee extends SerialCloneable{
	private String name;
	private double salary;
	private Date hireDay;
	public static int RECORD_SIZE = 100;
	public static int NAME_SIZE = 40;
	
	public Employee() {
		name = "";
		salary = 0.0;
		hireDay = new Date(0,0,0);
	}
	
	public Employee(String name, double salary, int year, int month, int day) {
		this.name = name;
		this.salary = salary;
		GregorianCalendar calendar = new GregorianCalendar(year, month -1, day);
		hireDay = calendar.getTime();
	}
	
	@Override
	public String toString() {
		return getClass().getName() + "[name =" + name + ",salary=" + salary + ",hireDay=" + hireDay + "]";
	}
	
	public Date getHireDay() {
		return hireDay;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}

	public void readExternal(ObjectInput s) throws IOException{
		name = s.readUTF();
		salary = s.readDouble();
		hireDay = new Date(s.readLong());
	}

	public void writeExternal(ObjectOutput s) throws IOException{
		s.writeUTF(name);
		s.writeDouble(salary);
		s.writeLong(hireDay.getTime());
	}	
}
