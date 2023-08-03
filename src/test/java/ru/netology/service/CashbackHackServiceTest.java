package ru.netology.service;


import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);

    }
    @Test
    public void testRemainCashBack() {
        CashbackHackService service = new CashbackHackService();

        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100 ;


        assertEquals(expected, actual);

    }

}