package com.prady.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class GeoDataControllerTest {

    @Autowired
    GeoDataController geoDataController;

    @Test
    void health() {
        assertEquals( "HEALTH CHECK OKAY!", geoDataController.healthCheck());
    }

    @Test
    void version() {
        assertEquals( "The actual version is 1.0.0", geoDataController.version());
    }

    @Test
    void nationsLength() {
        Integer nationsLength = geoDataController.getRandomNations().size();
        assertEquals(10, nationsLength);
    }

    @Test
    void currenciesLength() {
        Integer currenciesLength = geoDataController.getRandomCurrencies().size();
        assertEquals(20, currenciesLength);
    }

}