package com.janith.EmployeeRepoBackEnd;

import com.janith.EmployeeRepoBackEnd.model.Employee;
import com.janith.EmployeeRepoBackEnd.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeRepoBackEndApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeRepoBackEndApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		/*Employee employee1 = new Employee();
		employee1.setFirstName("Janith");
		employee1.setLastName("Madhushan");
		employee1.setEmailId("janith@gmail.com");
		employeeRepository.save(employee1);

		Employee employee2 = new Employee();
		employee2.setFirstName("Pasindu");
		employee2.setLastName("Sathsara");
		employee2.setEmailId("pasindu@gmail.com");
		employeeRepository.save(employee2);*/

	}
}
