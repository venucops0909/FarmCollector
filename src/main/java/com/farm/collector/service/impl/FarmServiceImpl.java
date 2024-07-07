package com.farm.collector.service.impl;

import com.farm.collector.dto.FarmDetailDTO;
import com.farm.collector.entity.FarmDetail;
import com.farm.collector.repository.FarmRepository;
import com.farm.collector.service.FarmService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * The Type farm service implementation class
 */
@Service
@Slf4j
public class FarmServiceImpl implements FarmService {

    @Autowired
    FarmRepository farmRepository;

    @Autowired
    ModelMapper modelMapper;

    /**
     *
     * This Service will save all the farm details given by the farmer
     * and returns the persisted info.
     *
     * @param farmDetailDTOS
     * @return FarmDetail List
     */
    @Override
    public List<FarmDetail> saveAllFarmDetails(List<FarmDetailDTO> farmDetailDTOS) {
        List<FarmDetail> farmDetails = new ArrayList<>();
        try {
            for (FarmDetailDTO farmDetailDTO :
                    farmDetailDTOS) {
                FarmDetail farmDetailFromDB = farmRepository.findByFarmNameAndCropType(farmDetailDTO.getFarmName(),
                        farmDetailDTO.getCropType());
                if (ObjectUtils.isEmpty(farmDetailFromDB)) {
                    //Adding new Farm details into the DB
                    farmDetails.add(modelMapper.map(farmDetailDTO, FarmDetail.class));
                } else {
                    //Modifying the existing record from DB with same farm name and crop type
                    farmDetailFromDB.setExpectedProduct(farmDetailDTO.getExpectedProduct());
                    farmDetailFromDB.setActualHarvested(farmDetailDTO.getActualHarvested());
                    farmDetailFromDB.setPlantingArea(farmDetailDTO.getPlantingArea());
                    farmDetails.add(farmDetailFromDB);
                }
            }
            farmRepository.saveAll(farmDetails);
        } catch (Exception e) {
            log.error("Error occurred while saving farmer details : {}", e.getMessage());
        }
        return farmDetails;
    }

    @Override
    public List<FarmDetail> getAllFarmCollectorDetails() {
        try{
            return farmRepository.findAll();
        } catch (Exception e){
            log.error("Exception while trying to fetch farm collector details : {}", e.getMessage());
        }
        return null;
    }
}
