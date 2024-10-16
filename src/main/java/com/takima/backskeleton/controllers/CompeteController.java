package com.takima.backskeleton.controllers;


import com.takima.backskeleton.DTO.CompeteDto;
import com.takima.backskeleton.models.Compete;
import com.takima.backskeleton.models.Team;
import com.takima.backskeleton.services.CompeteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin (origins = "http://localhost:4200")
@RequestMapping("compete")
@RestController
@RequiredArgsConstructor
public class CompeteController {
    private final CompeteService competeService;

    @GetMapping("/{id}")
    public Compete competeById(@PathVariable Long id){
        Compete compete = competeService.getById(id);
        System.out.println(compete.getTeams_compete().size());
        return competeService.getById(id);
    }
    @GetMapping("")
    public List<Compete> listCompete() {
        return competeService.findAll();
    }

    @CrossOrigin
    @PostMapping("")
    public Compete createCompete(@RequestBody CompeteDto competeDto) {
        System.out.println("COMPETE:  "+  competeDto.toString());
        return competeService.addCompete(competeDto);
    }

//    @GetMapping("/{competeId}/teams")
//    public List<Team> getAllTeamsFromCompete(@PathVariable Long competeId) {
//        return competeService.getAllTeamsFromCompete(competeId);
//    }
}
