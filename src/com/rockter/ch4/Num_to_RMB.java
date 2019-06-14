package com.rockter.ch4;

/**
 *     功能：输入一个八位以下数字并转换为中文大写
 *     完成日期:19/6/14 17:34
 *     造轮子的人：Rockter
 */
public class Num_to_RMB {
    private String[] capsnum = new String[]{"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
    private String[] capsunit = new String[]{"仟","佰","拾","万","仟","佰","拾"};

    protected String toCapsStr(String numStr){
        String result = "";
        int numLen = numStr.length();
        int unit = 8 - numLen;//确定单位的最高位
        for(int i = 0;i < numLen;i ++){
            int num = numStr.charAt(i) - 48;//由ASCII变为int
            if(i != numLen - 1 && num != 0){
                result = result + capsnum[num] + capsunit[unit];//由高位至低位
                unit++;
            }
            else{
                result = result + capsnum[num];
            }
        }
        return result;
    }
}
