package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class UtilTest {

    //1
    @Test
    public void whenNumberGreater3999ThenNull() {
        assertNull(Util.convertArabicToRoman(4000));
    }

    //2
    @Test
    public void whenNumberLess1ThenNull() {
        assertNull(Util.convertArabicToRoman(0));
    }

    //3
    @Test
    public void whenNumberIs1ThenI() {
        assertEquals("I", Util.convertArabicToRoman(1));
    }

    //4
    @Test
    public void whenNumberIs3ThenIII() {
        assertEquals("III", Util.convertArabicToRoman(3));
    }

    //5
    @Test
    public void whenNumberIs4ThenIV() {
        assertEquals("IV", Util.convertArabicToRoman(4));
    }

    //6
    @Test
    public void whenNumberIs5ThenV() {
        assertEquals("V", Util.convertArabicToRoman(5));
    }

    //7
    @Test
    public void whenNumberIs6ThenVI() {
        assertEquals("VI", Util.convertArabicToRoman(6));
    }

    //8
    @Test
    public void whenNumberIs8ThenVIII() {
        assertEquals("VIII", Util.convertArabicToRoman(8));
    }

    //9
    @Test
    public void whenNumberIs9ThenI() {
        assertEquals("IX", Util.convertArabicToRoman(9));
    }

    //10
    @Test
    public void whenNumberIs10ThenX() {
        assertEquals("X", Util.convertArabicToRoman(10));
    }

    //11
    @Test
    public void whenNumberIs11ThenXI() {
        assertEquals("XI", Util.convertArabicToRoman(11));
    }

    //12
    @Test
    public void whenNumberIs14ThenXIV() {
        assertEquals("XIV", Util.convertArabicToRoman(14));
    }

    @Test
    public void whenNumberIs18ThenXVIII() {
        assertEquals("XVIII", Util.convertArabicToRoman(18));
    }

    @Test
    public void whenNumberIs19ThenXIX() {
        assertEquals("XIX", Util.convertArabicToRoman(19));
    }

    @Test
    public void whenNumberIs20ThenXX() {
        assertEquals("XX", Util.convertArabicToRoman(20));
    }

    @Test
    public void whenNumberIs40ThenXL() {
        assertEquals("XL", Util.convertArabicToRoman(40));
    }

    @Test
    public void whenNumberIs50ThenL() {
        assertEquals("L", Util.convertArabicToRoman(50));
    }

    @Test
    public void whenNumberIs95ThenXCV() {
        assertEquals("XCV", Util.convertArabicToRoman(95));
    }

    @Test
    public void whenNumberIs100ThenC() {
        assertEquals("C", Util.convertArabicToRoman(100));
    }

    @Test
    public void whenNumberIs195ThenCXCV() {
        assertEquals("CXCV", Util.convertArabicToRoman(195));
    }

    @Test
    public void whenNumberIs404ThenCDIV() {
        assertEquals("CDIV", Util.convertArabicToRoman(404));
    }

    @Test
    public void whenNumberIs555ThenDLV() {
        assertEquals("DLV", Util.convertArabicToRoman(555));
    }

    @Test
    public void whenNumberIs975ThenCMLXXV() {
        assertEquals("CMLXXV", Util.convertArabicToRoman(975));
    }

    @Test
    public void whenNumberIs999ThenCMXCIX() {
        assertEquals("CMXCIX", Util.convertArabicToRoman(999));
    }

    @Test
    public void whenNumberIs1000ThenM() {
        assertEquals("M", Util.convertArabicToRoman(1000));
    }

    @Test
    public void whenNumberIs1445ThenMCDXLV() {
        assertEquals("MCDXLV", Util.convertArabicToRoman(1445));
    }

    @Test
    public void whenNumberIs1684ThenMDCLXXXIV() {
        assertEquals("MDCLXXXIV", Util.convertArabicToRoman(1684));
    }

    @Test
    public void whenNumberIs1999ThenMCMXCIX() {
        assertEquals("MCMXCIX", Util.convertArabicToRoman(1999));
    }

    @Test
    public void whenNumberIs2000ThenMM() {
        assertEquals("MM", Util.convertArabicToRoman(2000));
    }

    @Test
    public void whenNumberIs2190ThenMMCXC() {
        assertEquals("MMCXC", Util.convertArabicToRoman(2190));
    }

    @Test
    public void whenNumberIs2333ThenMMCCCXXXIII() {
        assertEquals("MMCCCXXXIII", Util.convertArabicToRoman(2333));
    }

    @Test
    public void whenNumberIs2440ThenMMCDXL() {
        assertEquals("MMCDXL", Util.convertArabicToRoman(2440));
    }

    @Test
    public void whenNumberIs2580ThenMMDLXXX() {
        assertEquals("MMDLXXX", Util.convertArabicToRoman(2580));
    }

    @Test
    public void whenNumberIs2845ThenMMDCCCXLV() {
        assertEquals("MMDCCCXLV", Util.convertArabicToRoman(2845));
    }

    @Test
    public void whenNumberIs2999ThenMMCMXCIX() {
        assertEquals("MMCMXCIX", Util.convertArabicToRoman(2999));
    }

    @Test
    public void whenNumberIs3100ThenMMMC() {
        assertEquals("MMMC", Util.convertArabicToRoman(3100));
    }

    @Test
    public void whenNumberIs3378ThenIMMMCCCLXXVIII() {
        assertEquals("MMMCCCLXXVIII", Util.convertArabicToRoman(3378));
    }

    @Test
    public void whenNumberIs3460ThenMMMCDLX() {
        assertEquals("MMMCDLX", Util.convertArabicToRoman(3460));
    }

    @Test
    public void whenNumberIs3875ThenMMMDCCCLXXV() {
        assertEquals("MMMDCCCLXXV", Util.convertArabicToRoman(3875));
    }

    @Test
    public void whenNumberIs3999ThenMMMCMXCIX() {
        assertEquals("MMMCMXCIX", Util.convertArabicToRoman(3999));
    }
}