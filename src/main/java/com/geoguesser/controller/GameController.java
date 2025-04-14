package com.geoguesser.controller;

import com.geoguesser.model.StateLocation;
import com.geoguesser.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class GameController {

    private final LocationService locationService;

    @Autowired
    public GameController(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/game")
    public String game(Model model, HttpSession session) {
        // Get a random location
        StateLocation location = locationService.getRandomLocation();
        
        // Store the correct answer in session
        session.setAttribute("currentState", location.getState());
        session.setAttribute("currentCapital", location.getCapital());
        
        // Get all state names for dropdown
        List<String> stateNames = locationService.getAllStateNames();
        model.addAttribute("stateNames", stateNames);
        
        // Pass the location to the view
        model.addAttribute("location", location);
        
        return "game";
    }

    @PostMapping("/check")
    public String checkGuess(
            @RequestParam("stateGuess") String stateGuess,
            @RequestParam("capitalGuess") String capitalGuess,
            Model model,
            HttpSession session) {
        
        String currentState = (String) session.getAttribute("currentState");
        String currentCapital = (String) session.getAttribute("currentCapital");
        
        boolean stateCorrect = stateGuess.equals(currentState);
        boolean capitalCorrect = capitalGuess.equalsIgnoreCase(currentCapital);
        
        model.addAttribute("stateCorrect", stateCorrect);
        model.addAttribute("capitalCorrect", capitalCorrect);
        model.addAttribute("currentState", currentState);
        model.addAttribute("currentCapital", currentCapital);
        
        return "result";
    }
}