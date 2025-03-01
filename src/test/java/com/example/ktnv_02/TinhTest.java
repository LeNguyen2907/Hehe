package com.example.ktnv_02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TinhTest {

    Tinh tinh = new Tinh();
    @Test
    void tinhTong() {

        int exp = 11;
        int act = tinh.tinhTong(new int[] {1, 2, 4, 6, -2});

        Assertions.assertEquals(exp, act);
    }

    @Test
    void tinhTongSoAm() {

        int exp = -15;
        int act = tinh.tinhTong(new int[] {-1, -2, -4, -6, -2});

        Assertions.assertEquals(exp, act);
    }
    @Test
    void tinhTongCoSo_0() {

        int exp = -15;
        int act = tinh.tinhTong(new int[] {-1, -2, 0, -4, -6, -2});

        Assertions.assertEquals(exp, act);
    }

    @Test
    void tinhHieuCoSo_0() {

        int exp = 12;
        int act = tinh.tinhHieu(new int[] {-1, -2, 0, -4, -6, -2});

        Assertions.assertEquals(exp, act);
    }
}