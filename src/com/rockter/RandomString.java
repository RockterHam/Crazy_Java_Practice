package com.rockter;

public class RandomString {
    public void RandomStr(){
        String result = "";
        for(int i = 0;i < 6;i ++){
            int iValue = (int)(Math.random() * 26 + 97);
            result = result + (char)iValue;
        }
        System.out.println(result);
    }
}
