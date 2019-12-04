package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WhiskyRepository extends JpaRepository<Whisky, Long>, WhiskyRepositoryCustom {
    List<Whisky> findAllWhiskysByYear(int year);
    List<Whisky> findAllWhiskysByDistilleryRegion(String region);
    List<Whisky> findAllWhiskysByDistilleryNameAndAge(String name, int age);
}
