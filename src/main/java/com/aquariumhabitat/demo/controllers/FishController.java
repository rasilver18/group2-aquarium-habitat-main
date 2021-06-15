package com.aquariumhabitat.demo.controllers;

import com.aquariumhabitat.demo.models.Fish;
import com.aquariumhabitat.demo.repositories.FishRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Optional;

@Controller
public class FishController {

    @Resource
    private FishRepository fishRepo;

    @RequestMapping({"/all-fish"})
    public String displayFish(Model model){
        model.addAttribute("fish", fishRepo.findAll());
        return "allFishView";
    }
    @RequestMapping({"/fish/{id}"})
    public String displaySingleFish(@PathVariable long id, Model model) {
        Optional<Fish> findFishById = fishRepo.findById(id);
        Fish foundFish = findFishById.get();
        model.addAttribute("Fish", foundFish);
        return "singleFish";
    }
//        I dont think this is needed yet



    }
