package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/professionals")
public class HomeController {

    @Autowired
    private JobService professionalService;

    @PostMapping("/save")
    public String saveProfessionals(@RequestBody List<Map<String, Object>> professionalsData) {
        try {
            professionalService.saveProfessionals(professionalsData);
            return "Professionals data successfully saved!";
        } catch (Exception e) {
            e.printStackTrace();
            return "Failed to save professionals data.";
        }
    }
}
