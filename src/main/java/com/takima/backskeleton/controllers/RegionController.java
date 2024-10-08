package com.takima.backskeleton.controllers;

import com.takima.backskeleton.models.Region;
import com.takima.backskeleton.services.RegionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("regions")
@RestController
@RequiredArgsConstructor
public class RegionController {

    private final RegionService regionService;

    @GetMapping("")
    public List<Region> listRegions() {
        return regionService.findAll();
    }

    @GetMapping("/{id}")
    public Region getRegionById(@PathVariable Long id) {
        return regionService.getById(id);
    }


}
