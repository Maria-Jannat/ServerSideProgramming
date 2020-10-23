package com.example.controller;

import com.example.entity.College;
import com.example.repo.CollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/college/")
public class CollegeController {

    @Autowired
    private CollegeRepository repo;

    @GetMapping(value = "add")
    public String add(@RequestParam String name) {
        College college = new College();
        college.setName(name);
        repo.save(college);
        return "Insert success";
    }

    @GetMapping(value = "update")
    public String update(@RequestParam String name, @RequestParam Long id) {
        College college = new College();
        college.setName(name);
        college.setId(id);
        repo.save(college);
        return "Update success";
    }

    @GetMapping(value = "delete")
    public String delete(@RequestParam Long id) {
        repo.deleteById(id);
        return "Delete success";
    }

    @GetMapping(value = "list")
    public List<College> showAll() {
        return repo.findAll();
    }
}
