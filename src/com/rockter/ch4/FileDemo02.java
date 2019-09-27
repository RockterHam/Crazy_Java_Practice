package com.rockter.ch4;

import java.io.*;

import static java.lang.Integer.*;

public class FileDemo02 {
   public void Reader(){
       FileInputStream fis = null;
       try {
           fis = new FileInputStream("123.txt");
           StringBuilder sb = new StringBuilder();
           int temp = 0;
           while ((temp = fis.read()) != -1){
               sb.append((char)temp);
           }
           System.out.println(sb);
       }catch (Exception e){
           e.printStackTrace();
       }finally {
           try {
               fis.close();
           } catch (IOException e) {
               e.printStackTrace();
           }
       }
   }
   public static void main(String[] args){
       FileDemo02 fd2 = new FileDemo02();
       fd2.Reader();
   }
}
