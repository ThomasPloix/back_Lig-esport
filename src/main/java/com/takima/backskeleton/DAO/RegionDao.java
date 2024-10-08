package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.Region;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegionDao extends JpaRepository<Region, Long> {
}
