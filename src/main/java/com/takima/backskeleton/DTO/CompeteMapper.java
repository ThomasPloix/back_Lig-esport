package com.takima.backskeleton.DTO;

import com.takima.backskeleton.models.Compete;
import com.takima.backskeleton.models.Region;
import com.takima.backskeleton.services.RegionService;

public class CompeteMapper {


    public static Compete fromDto(CompeteDto dto, Long id, Region region) {
        return new Compete.Builder()
                .id(id)
                .name(dto.getName())
                .region(region)
                .build();
    }


}
