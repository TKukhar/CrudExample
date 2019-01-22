package com.crud.controller;

import com.crud.entity.Employee;
import com.crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class EmployeeController {

    @Autowired
    public EmployeeService employeeService;

    @GetMapping("/")
    public String getAllEmployees(Model model) {
        model.addAttribute("employees", employeeService.findAll());
        return "employeesList";
    }


    @GetMapping("/employee/{id}")
    public String getById(@PathVariable("id") int id, Model model) {
        model.addAttribute("employee", employeeService.getById(id));
        return "showEmployee";
    }

    @GetMapping("/addEmployee")
    public String createEmployeePage() {
        return "createEmployee";
    }


    @PostMapping("/addEmployee")
    public String addEmployee(@ModelAttribute("employee") Employee employee) throws Exception {
        employeeService.save(employee);
        return "redirect:/";
    }

    @PostMapping("/updateEmployee")
    public String updateEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.update(employee);
        return "redirect:/employee/" + employee.getId();
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable("id") int id, Model model) {
        model.addAttribute("employee", employeeService.getById(id));
        return "editEmployee";
    }

    @GetMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable("id") int id) {
        employeeService.delete(id);
        return "redirect:/";
    }
}
