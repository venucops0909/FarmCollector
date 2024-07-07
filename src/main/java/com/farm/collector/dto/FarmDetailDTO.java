package com.farm.collector.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The type FarmDetails dto.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FarmDetailDTO {

    private String farmName;
    private String cropType;
    private double plantingArea;
    private double expectedProduct;
    private double actualHarvested;
    private String season;
}
