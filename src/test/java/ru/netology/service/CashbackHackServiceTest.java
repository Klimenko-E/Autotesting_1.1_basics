package ru.netology.service;

import static org.testng.Assert.*;


public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @org.testng.annotations.Test
    public void testWithSurchargeLess1000() {

        int actual = service.remain(600);
        int expected = 400;

        assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void testWithSurchargeMore1000() {

        int actual = service.remain(1600);
        int expected = 400;

        assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void testWithoutSurcharge() {

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void testWithSurcharge1000() {

        int actual = service.remain(0);
        int expected = 1000;

        assertEquals(actual, expected);

    }

}