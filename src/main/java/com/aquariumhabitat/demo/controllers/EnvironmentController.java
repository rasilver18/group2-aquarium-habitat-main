package com.aquariumhabitat.demo.controllers;


import com.aquariumhabitat.demo.models.Environments;
import com.aquariumhabitat.demo.repositories.EnvironmentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Optional;

@Controller
public class EnvironmentController {

    @Resource
    private EnvironmentRepository environmentRepo;

//    @Resource
//    private HashTagRepository hashTagRepo;

    @RequestMapping("/environments")
    public String displayEnvironments(Model model){
        model.addAttribute("environments", environmentRepo.findAll());
        return "environmentsView";
    }

    @RequestMapping("/environments/{id}")
    public String displaySingleEnvironment(@PathVariable long id, Model model){
        Optional<Environments> retrievedEnvironment = environmentRepo.findById(id);
        Environments foundEnvironment = retrievedEnvironment.get();
        model.addAttribute("environment", foundEnvironment);
        return "environmentView";
    }

}
