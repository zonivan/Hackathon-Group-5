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
        session.setAttribute("locationName", location.getLocationName());
        session.setAttribute("stateFact", location.getStateFact());
        session.setAttribute("stateHint", location.getStateHint());
        session.setAttribute("stateGuessed", false); // Track if state has been guessed
        
        // Get all state names for dropdown
        List<String> stateNames = locationService.getAllStateNames();
        model.addAttribute("stateNames", stateNames);
        
        // Pass the location to the view
        model.addAttribute("location", location);
        model.addAttribute("showHint", false);
        
        return "game";
    }
    
    @GetMapping("/show-hint")
    public String showHint(Model model, HttpSession session) {
        // Get current game state
        String currentState = (String) session.getAttribute("currentState");
        String stateHint = (String) session.getAttribute("stateHint");
        
        if (currentState == null) {
            return "redirect:/game";
        }
        
        // Get all state names for dropdown
        List<String> stateNames = locationService.getAllStateNames();
        model.addAttribute("stateNames", stateNames);
        
        // Pass the needed attributes to the view
        model.addAttribute("location", session.getAttribute("location"));
        model.addAttribute("showHint", true);
        model.addAttribute("stateHint", stateHint);
        
        return "game";
    }
    
    @PostMapping("/check-state")
    public String checkStateGuess(
            @RequestParam("stateGuess") String stateGuess,
            Model model,
            HttpSession session) {
        
        String currentState = (String) session.getAttribute("currentState");
        String currentCapital = (String) session.getAttribute("currentCapital");
        String locationName = (String) session.getAttribute("locationName");
        String stateFact = (String) session.getAttribute("stateFact");
        
        // Handle case where session attributes might be null (session expired)
        if (currentState == null) {
            return "redirect:/game"; // Redirect to a new game
        }
        
        boolean stateCorrect = stateGuess.equals(currentState);
        
        // Save state result in session
        session.setAttribute("stateGuessed", true);
        session.setAttribute("stateCorrect", stateCorrect);
        session.setAttribute("userStateGuess", stateGuess);
        
        // Pass needed data to the capital guess page
        model.addAttribute("stateCorrect", stateCorrect);
        model.addAttribute("currentState", currentState);
        model.addAttribute("userStateGuess", stateGuess);
        model.addAttribute("locationName", locationName);
        model.addAttribute("stateFact", stateFact);
        
        return "capital-guess"; // Go to the capital guessing page
    }
    
    @PostMapping("/check-capital")
    public String checkCapitalGuess(
            @RequestParam("capitalGuess") String capitalGuess,
            Model model,
            HttpSession session) {
        
        String currentState = (String) session.getAttribute("currentState");
        String currentCapital = (String) session.getAttribute("currentCapital");
        String locationName = (String) session.getAttribute("locationName");
        String stateFact = (String) session.getAttribute("stateFact");
        Boolean stateCorrect = (Boolean) session.getAttribute("stateCorrect");
        String userStateGuess = (String) session.getAttribute("userStateGuess");
        
        // Handle case where session attributes might be null (session expired)
        if (currentState == null || currentCapital == null || stateCorrect == null) {
            return "redirect:/game"; // Redirect to a new game
        }
        
        boolean capitalCorrect = capitalGuess.equalsIgnoreCase(currentCapital);
        
        model.addAttribute("stateCorrect", stateCorrect);
        model.addAttribute("capitalCorrect", capitalCorrect);
        model.addAttribute("currentState", currentState);
        model.addAttribute("currentCapital", currentCapital);
        model.addAttribute("userStateGuess", userStateGuess);
        model.addAttribute("userCapitalGuess", capitalGuess);
        model.addAttribute("locationName", locationName);
        model.addAttribute("stateFact", stateFact);
        
        return "result";
    }
    
    // No longer needed with our button-based approach
    // Removed guess-from-map endpoint
}