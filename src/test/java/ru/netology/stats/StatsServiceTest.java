package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatsServiceTest {

    StatsService service = new StatsService();
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void minSales() {
        Assertions.assertEquals(9, service.minSales(sales));
    }

    @Test
    void totalSales() {
        Assertions.assertEquals(180, service.totalSales(sales));
    }

    @Test
    void averageSales() {
        Assertions.assertEquals(15.0, service.averageSales(sales));

    }

    @Test
    void maxSales() {
        Assertions.assertEquals(12, service.maxSales(sales));
    }

    @Test
    void salesAboveAverage() {
        Assertions.assertEquals(5, service.salesAboveAverage(sales));
    }

    @Test
    void salesBelowAverage() {
        Assertions.assertEquals(5, service.salesBelowAverage(sales));
    }
}