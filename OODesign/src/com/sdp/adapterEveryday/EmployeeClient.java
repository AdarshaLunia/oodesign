package com.sdp.adapterEveryday;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
	public List<Employee> getEmployeeList() {

		List<Employee> employees = new ArrayList<>();

		Employee employeeFromDB = new EmpoyeeDB("1234", "Adarsha", "Lunia", "adarsha@lunia.com");

		employees.add(employeeFromDB);

		// Will not work! This is where the adapter comes into play!

		// Employee employeeFromLdap = new EmployeeLdap("chewie", "Solo", "Han",
		// "han@solo.com");

		EmployeeLdap employeeFromLdap = new EmployeeLdap("012", "Adi", "java", "java@solo.com");

		employees.add(new EmployeeAdapterLdap(employeeFromLdap));

		EmployeeCSV employeeFromCSV = new EmployeeCSV("567,Sherlock,Holmes,sherlock@holmes.com");

		employees.add(new EmployeeAdapterCSV(employeeFromCSV));

		return employees;

	}
}
