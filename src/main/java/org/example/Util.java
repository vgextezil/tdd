package org.example;
/*
  @author   hakmandul
  @project   untitled
  @class  Util
  @version  1.0.0
  @since 2/9/24 - 08.17
*/

public class Util {
    public static String convertArabicToRoman(int number){
        StringBuilder result = new StringBuilder();
        if (number<1){
            return null;
        }
        if (number>=4000){
            return null;
        }
        String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] value = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        for (int i = 0; number > 0; i++) {
            while(number >= value[i]){
                result.append(roman[i]);
                number -=value[i];
            }
        }
        return result.toString();
    }
}
