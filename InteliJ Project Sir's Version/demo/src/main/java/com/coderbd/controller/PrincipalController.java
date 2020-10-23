package com.coderbd.controller;

import com.coderbd.entity.College;
import com.coderbd.entity.Principal;
import com.coderbd.repo.CollegeRepository;
import com.coderbd.repo.PrincipalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/principal/")
public class PrincipalController {

    @Autowired
    private CollegeRepository collegeRepository;

    @Autowired
    private PrincipalRepository repo;

    @GetMapping(value = "add")
    public String add(@RequestParam String name, @RequestParam Long cid) {
        Principal principal = new Principal();
        principal.setName(name);
        principal.setCollege(this.collegeRepository.getOne(cid));
        repo.save(principal);
        return "Insert success";
    }

    @GetMapping(value = "update")
    public String update(@RequestParam String name, @RequestParam Long cid, @RequestParam Long id) {
        Principal principal = new Principal();
        principal.setName(name);
        principal.setCollege(this.collegeRepository.getOne(cid));
        principal.setId(id);
        repo.save(principal);
        return "Update success";
    }

    @GetMapping(value = "delete")
    public String delete(@RequestParam Long id) {
        repo.deleteById(id);
        return "Delete success";
    }

    @GetMapping(value = "list")
    public List<Principal> showAll() {
        return repo.findAll();
    }
}
