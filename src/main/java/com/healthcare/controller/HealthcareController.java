package com.healthcare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
public class HealthcareController {

    private static final Map<String, String> GUIDANCE = Map.of(
            "fever", "Take adequate rest, drink fluids, and monitor your temperature. Seek medical advice if symptoms are severe or persistent.",
            "cough", "Stay hydrated and rest. Persistent, severe, or breathing-related symptoms should be assessed by a healthcare professional.",
            "headache", "Rest in a quiet place and stay hydrated. Seek professional advice for severe, sudden, or recurring headaches.",
            "cold", "Rest, drink warm fluids, and maintain good hydration. Contact a healthcare professional if symptoms worsen.",
            "stomach pain", "Avoid heavy meals and stay hydrated. Severe or persistent abdominal pain needs professional medical evaluation."
    );

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("symptoms", GUIDANCE.keySet());
        return "index";
    }

    @PostMapping("/check-symptom")
    public String checkSymptom(@RequestParam String symptom, Model model) {
        String key = symptom.trim().toLowerCase();
        String result = GUIDANCE.getOrDefault(
                key,
                "This app provides only general information. Please consult a qualified healthcare professional for personalized advice."
        );

        model.addAttribute("symptoms", GUIDANCE.keySet());
        model.addAttribute("selectedSymptom", symptom);
        model.addAttribute("result", result);
        return "index";
    }
}
