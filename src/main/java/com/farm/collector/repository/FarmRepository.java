package com.farm.collector.repository;

import com.farm.collector.entity.FarmDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * The type farm repository class
 */
@Repository
public interface FarmRepository extends JpaRepository<FarmDetail, Integer> {

    FarmDetail findByFarmNameAndCropType(String farmName, String cropType);

}
