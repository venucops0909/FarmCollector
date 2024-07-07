package com.farm.collector.service;

import com.farm.collector.dto.FarmDetailDTO;
import com.farm.collector.entity.FarmDetail;

import java.util.List;

/**
 *
 * The type Farm Service
 */
public interface FarmService {


    /**
     *
     * This Service will save all the farm details given by the farmer
     * and returns the persisted info.
     *
     * @param farmDetailDTOS
     * @return FarmDetail List
     */
    List<FarmDetail> saveAllFarmDetails(List<FarmDetailDTO> farmDetailDTOS);

    List<FarmDetail> getAllFarmCollectorDetails();
}
