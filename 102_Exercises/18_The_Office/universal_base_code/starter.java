/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		dwight.employeeToString();
		Employee jim = new Employee(2474, "Jim", "Halpwert", 4416.66);
		jim.employeeToString();
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250);
		pam.employeeToString();
		Employee sarah = new Employee(2000, "Sarah", "Tudor", 10000);
		sarah.employeeToString();
		michael.raiseSalary(100);
		dwight.raiseSalary(100);
		jim.raiseSalary(100);
		pam.raiseSalary(100);
		sarah.raiseSalary(100);
		michael.employeeToString();
		dwight.employeeToString();
		jim.employeeToString();
		pam.employeeToString();
		sarah.employeeToString();
	}
}
