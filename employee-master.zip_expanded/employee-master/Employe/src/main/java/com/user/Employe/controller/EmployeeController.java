package com.user.Employe.controller;

import java.util.Optional;

import javax.management.AttributeNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.user.Employe.entity.Employee;
import com.user.Employe.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeservice;
	@GetMapping("/employee")
	public String getAllemployee(Model model) {
		
		model.addAttribute("employees", employeeservice.getAllemployees());
		
		return "employeeslistform";	
	}
		@GetMapping("/employee/new")        
	public String createEmployeeForm(Model model) {
		
		Employee employee = new Employee();
		
		model.addAttribute("employees", employee);
		
		return "createemployeeform";
		
	}
	@PostMapping("/employee")
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		employeeservice.saveEmployee(employee);
		
		return "redirect:/employee";
		
	}
			@PutMapping("/{id}")
	public Employee updateEmployee(@RequestBody Employee employee, @PathVariable(value ="id") Long employeeid) throws AttributeNotFoundException {
		
		Employee existing = this.employeeservice.UpdateEmployee(employeeid).orElseThrow(() -> new AttributeNotFoundException("employee not found with id :" + employeeid));
		
		existing.setEmployeeName(employee.getEmployeeName());
		existing.setEmployeeType(employee.getEmployeeType());
		existing.setEmployeeDepartment(employee.getEmployeeDepartment());
		existing.setEmail(employee.getEmail());
		
		
		return this.employeeservice.saveEmployee(existing);
		
	}
//			@PostMapping("/employee/delete")
//			public String deleteEmployee(@ModelAttribute("employee") Employee employee) {
//				employeeservice.saveEmployee(employee);
//				
//				return "redirect:/employee";
//				
//			}
//			@PutMapping("/{id}")
//			public Employee deleteEmployee(@RequestBody Employee employee, @PathVariable(value ="id") Long employeeid) throws AttributeNotFoundException {
//				
//				Employee existing = this.employeeservice.deleteEmployee(employeeid).orElseThrow(() -> new AttributeNotFoundException("employee not found with id :" + employeeid));
//				

//				
//				return this.employeeservice.saveEmployee(existing);
//				
//}
}
