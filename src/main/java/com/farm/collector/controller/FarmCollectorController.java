package com.farm.collector.controller;

import com.farm.collector.dto.FarmDetailDTO;
import com.farm.collector.entity.FarmDetail;
import com.farm.collector.service.FarmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.farm.collector.constants.Constants.URL.FARM_COLLECTOR;
import static com.farm.collector.constants.Constants.URL.GET_FARM_COLLECTOR_DETAILS;
import static com.farm.collector.constants.Constants.URL.SAVE_FARM;

/**
 * The type Farm Collector controller.
 */
@RestController
@RequestMapping(FARM_COLLECTOR)
public class FarmCollectorController {

    @Autowired
    private FarmService farmService;

    /**
     * Post the planted or harvested details per farm by the farmer
     *
     * @return the planted or harvested details persisted into the h2 DB
     */
    @PostMapping(value = SAVE_FARM, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<FarmDetail> saveAllFarmDetails(@RequestBody List<FarmDetailDTO> farmDetailDTOS) {

        return farmService.saveAllFarmDetails(farmDetailDTOS);

    }


    /**
     * Gets the reports for the farm collector for each season expected vs actual amount of product
     *
     * @return the expected vs actual details of the products
     */
    @GetMapping(value = GET_FARM_COLLECTOR_DETAILS, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<FarmDetail> getFarmCollectorDetails() {

        return farmService.getAllFarmCollectorDetails();

    }
}
