package com.example.controller;

import com.example.entity.Principaal;
import com.example.repo.CollegeRepository;
import com.example.repo.PrincipaalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

    @RestController
    @RequestMapping(value = "/principaal/")
    public class PrincipaalController {

        @Autowired
        private CollegeRepository collegeRepository;

        @Autowired
        private PrincipaalRepository repo;

        @GetMapping(value = "add")
        public String add(@RequestParam String name, @RequestParam Long cid) {
            Principaal principaal = new Principaal();
            principaal.setName(name);
            principaal.setCollege(this.collegeRepository.getOne(cid));
            repo.save(principaal);
            return "Insert successfully into principaal";
        }

        @GetMapping(value = "update")
        public String update(@RequestParam String name, @RequestParam Long cid, @RequestParam Long id) {
            Principaal principaal = new Principaal();
            principaal.setName(name);
            principaal.setCollege(this.collegeRepository.getOne(cid));
            principaal.setId(id);
            repo.save(principaal);
            return "Update success";
        }

        @GetMapping(value = "delete")
        public String delete(@RequestParam Long id) {
            repo.deleteById(id);
            return "Delete success";
        }

        @GetMapping(value = "list")
        public List<Principaal> showAll() {
            return repo.findAll();
        }
    }

