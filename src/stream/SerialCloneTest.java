package stream;

import java.io.*;
import java.util.*;
import common.*;

public class SerialCloneTest {
	public static void main(String[] args) {
		Employee harry = new Employee("Harry Hacker", 35000, 1989, 10, 1);
		Employee harry2 = (Employee) harry.clone();
		
		// mutate harry
		harry.raiseSalary(10);
		
		// now harry and the clone are different
		System.out.println(harry);
		System.out.println(harry2);
	}
}
