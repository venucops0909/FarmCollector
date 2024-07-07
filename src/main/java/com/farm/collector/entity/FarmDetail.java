package com.farm.collector.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "FarmDetail")
public class FarmDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Integer id;

    @Column(name = "farm_name")
    private String farmName;

    @Column(name = "crop_type")
    private String cropType;

    @Column(name = "planting_area")
    private double plantingArea;

    @Column(name = "expected_product")
    private double expectedProduct;

    @Column(name = "actual_harvested")
    private double actualHarvested;

    @Column(name = "season")
    private String season;
}
