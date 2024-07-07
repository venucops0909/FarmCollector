package com.farm.collector.constants;


import lombok.AccessLevel;
import lombok.NoArgsConstructor;

public class Constants {

    /**
     * The type URL.
     */
    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class URL {
        /**
         * The constant API_VERSION.
         */
        public static final String FARM_COLLECTOR = "/farm-collector";
        /**
         * The constant SAVE_FARM.
         */
        public static final String SAVE_FARM = "/save-farm";
        /**
         * The constant GET_FARM_COLLECTOR_DETAILS.
         */
        public static final String GET_FARM_COLLECTOR_DETAILS = "/get-reports";
    }


    /**
     * The type descriptoin.
     */
    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class DESCRIPTION {
        /**
         * The constant SAVE_FARM_DETAILS.
         */
        public static final String SAVE_FARM_DETAILS = "save the farm details";
    }
}
