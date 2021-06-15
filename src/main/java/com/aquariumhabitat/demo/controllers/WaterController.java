package com.aquariumhabitat.demo.controllers;

import com.aquariumhabitat.demo.repositories.WaterRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class WaterController {
    @Resource
    private WaterRepository waterRepo;

    @RequestMapping({"/water", "/", ""})
    public String displayWater(Model model) {
        model.addAttribute("water", waterRepo.findAll());
        return "water";
    }
}