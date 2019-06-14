package com.rockter.ch4;

/**
 *      功能：随机生成6个字母（ASCII）
 *      完成时间：忘了
 *      造轮子的人：Rockter
 *
 *
 */

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
