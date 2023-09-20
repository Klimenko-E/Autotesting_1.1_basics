package ru.netology.service;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void testWithSurchargeLess1000() {

        int actual = service.remain(600);
        int expected = 400;

        assertEquals(expected, actual);

    }

    @org.junit.Test
    public void testWithSurchargeMore1000() {

        int actual = service.remain(1600);
        int expected = 400;

        assertEquals(expected, actual);

    }

    @org.junit.Test
    public void testWithoutSurcharge() {

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(expected, actual);

    }

    @org.junit.Test
    public void testWithSurcharge1000() {

        int actual = service.remain(0);
        int expected = 1000;

        assertEquals(expected, actual);

    }

}
    
