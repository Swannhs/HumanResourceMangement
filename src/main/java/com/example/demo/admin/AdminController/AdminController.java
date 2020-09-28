package com.example.demo.admin.AdminController;

import com.example.demo.employee.entity.Employee;
import com.example.demo.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private EmployeeService service;

    @GetMapping("/register")
    public String register() {
        return "registration";
    }

    @ModelAttribute("employee")
    public Employee employee() {
        return new Employee();
    }

    @PostMapping("/register")
    public String registerUserAccount(@ModelAttribute("employee") Employee employee) {
        service.save(employee);
        return "redirect:/admin/register?success";
    }


    @GetMapping("dashboard")
    public String dashboard() {
        return "dashboard";
    }
}
