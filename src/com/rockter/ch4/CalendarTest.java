package com.rockter.ch4;

import java.text.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalendarTest {
    public static void main(String[] args) {
        CalendarTest ct = new CalendarTest();
        try {
            String input = ct.inputDate();
            ct.DrawCalendar(input);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    public void DrawCalendar(String input) throws ParseException {
        SimpleDateFormat df =new SimpleDateFormat("yyyy-MM-dd");
        Date date = df.parse(input);
        Calendar c = new GregorianCalendar();
        c.setTime(date);
        int dmax = c.getActualMaximum(Calendar.DATE);
        int d = c.get(Calendar.DATE);
        c.set(Calendar.DATE,1);
        System.out.println("日\t一\t二\t三\t四\t五\t六");
        for (int i = 0;i<c.get(Calendar.DAY_OF_WEEK)-1;i++){
            System.out.print("\t");
        }
        for (int i = 0;i<dmax;i++){
            if (c.get(Calendar.DATE) == d){
                System.out.print(c.get(Calendar.DATE)+"*");
            }else{
                System.out.print(c.get(Calendar.DATE));
            }
            if (c.get(Calendar.DAY_OF_WEEK) == 7){
                System.out.print("\n");
            }else{
                System.out.print("\t");
            }
            c.add(Calendar.DATE,1);
        }
    }
    public String inputDate(){
        System.out.println("输入日期以查询日历（格式xxxx-xx-xx）");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        return input;
    }
}
