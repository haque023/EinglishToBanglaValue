package com.emdad.valueconverter.util;

public class TextConverter {

    public String getNumber(String number){

        if(!number.equals("") ) {
            if(!number.contains("-")) {
                Long l = Long.parseLong(number);
                String generateValue =englishToBangla(l);
                return  generateValue;
            }
            else{
                String value =number;
                StringBuilder sb = new StringBuilder(value);
                sb.deleteCharAt(0);
                value=sb.toString();
                if(!value.equals("")) {
                    Long l = Long.parseLong(value);
                    String generateValue = "-" + englishToBangla(l);
                    return generateValue;
                }
                else {
                    return "";
                }
            }
        }
        else {
            return "";
        }

    }

    private String englishToBangla(long key){


        String ss=key+"";

        String s = "";
        int i=0;


        while (key>=0){
            if(key==0){
                s+="";
                break;
            }
            long val=key%10;
            key=key/10;
            if(val==0){
                s+="০";
            }else if(val==1){
                s+="১";
            }else if(val==2){
                s+="২";
            }else if(val==3){
                s+="৩";
            }else if(val==4){
                s+="৪";
            }else if(val==5){
                s+="৫";
            }else if(val==6){
                s+="৬";
            }else if(val==7){
                s+="৭";
            }
            else if(val==8){
                s+="৮";
            }else {
                s+="৯";
            }
        }

        StringBuilder input1 = new StringBuilder();
        input1.append(s);
        return input1.reverse().toString();
    }
}
