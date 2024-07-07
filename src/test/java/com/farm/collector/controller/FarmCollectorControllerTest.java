package com.farm.collector.controller;

import com.farm.collector.dto.FarmDetailDTO;
import com.farm.collector.entity.FarmDetail;
import com.farm.collector.service.FarmService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.mockito.Mockito.*;

class FarmCollectorControllerTest {
    @Mock
    FarmService farmService;
    @InjectMocks
    FarmCollectorController farmCollectorController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testSaveAllFarmDetails() {
        List<FarmDetail> farmDetails = List.of(new FarmDetail());
        when(farmService.saveAllFarmDetails(any())).thenReturn(farmDetails);

        List<FarmDetail> result = farmCollectorController.saveAllFarmDetails(List.of(new FarmDetailDTO("farmName", "cropType", 0d, 0d, 0d, "season")));
        Assertions.assertEquals(farmDetails, result);
    }

    @Test
    void testGetFarmCollectorDetails() {
        List<FarmDetail> farmDetails = List.of(new FarmDetail());
        when(farmService.getAllFarmCollectorDetails()).thenReturn(farmDetails);

        List<FarmDetail> result = farmCollectorController.getFarmCollectorDetails();
        Assertions.assertEquals(farmDetails, result);
    }
}
