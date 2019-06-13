package com.rockter.ch4;

public class Num_to_RMB {
    private String[] capsnum = new String[]{"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
    private String[] capsunit = new String[]{"仟","佰","拾"};

    protected String toCapsStr(String numStr){
        String result = "";
        int numLen = numStr.length();
        for(int i = 0;i < numLen;i ++){
            int num = numStr.charAt(i) - 48;
            if(i != numLen - 1 && num != 0){
                result = result + capsnum[num] + capsunit[i];
            }
            else{
                result = result + capsnum[num];
            }
        }
        return result;
    }
}
