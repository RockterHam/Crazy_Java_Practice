package com.rockter.ch4;


import java.util.Arrays;

public class Do {

    public static void main(String[] args){

        //Switch s = new Switch();
        //s.AutoSwitch();
        //s.ForceSwitch();

        //***********************

        //RandomString r = new RandomString();
        //r.RandomStr();

        //***********************

        //AutoPromote a = new AutoPromote();
        //a.AutoPro();

        //***********************

        //int[] arr = new int[]{2,5,6,8};
        //System.out.println(Arrays.binarySearch(arr,0,2,5));//二分法查找，数组必须为升序，返回数组的索引值（p103)

        //***********************

//        int[] arr_copyOf;
//        arr_copyOf = Arrays.copyOf(arr,4);//Copy一个数组，第二个参数为新数组长度
//        System.out.println(arr_copyOf[2]);

        //***********************

//        int[] arr_copyOfRange;
//        arr_copyOfRange = Arrays.copyOfRange(arr,0,4);//Copy一个数组，创建to-from个元素
//        System.out.println(arr_copyOfRange[0]);
//
//        System.out.println(Arrays.equals(arr,arr_copyOfRange));

        //***********************

//        int[] arr_fill = new int[]{1,3,4,5,6,7,8};
//        Arrays.fill(arr_fill,1,5,5);//将数组的元素from-to赋值为val
//        for(int i = 0;i < 7;i ++){                       //for (int i = fromIndex; i < toIndex; i++)
//            System.out.println(arr_fill[i]);
//        }

        //***********************

//        int[] arr_sort = new int[]{1,4,3,2,6,7,4,3,5,9};
//        Arrays.sort(arr_sort);                          //排序，或在from-to间排序
//        for(int i = 0;i < 10;i++){
//            System.out.println(arr_sort[i]);
//        }

        //***********************

//        int[] arr_toStr = new int[]{1,3,2,4,6,3,5};
//        String str = Arrays.toString(arr_toStr);        //变为字符串，用逗号隔开
//        System.out.println(str);

        //***********************

//        String s = "www.runoob.com";
//        char result = s.charAt(0);                      //return w(char);
//        System.out.println(result);

        //***********************

        Num_to_RMB numToRmb = new Num_to_RMB();
        System.out.println(numToRmb.toCapsStr("23453333"));//输入八位以下的数字

    }
}
