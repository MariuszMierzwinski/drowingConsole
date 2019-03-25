package codewarseKata;

import java.util.Arrays;

public class EncryptThis {
    public static String encryptThis(String s) {
        String str=s;
        String tmp="";
        String[] arry = str.split(" ");
        if(s.length()!=0) {
            for (int i = 0; i < arry.length; i++) {
                String[] chararry = arry[i].split("");
                for (int j = 0; j < chararry.length; j++) {
                    if (j == 0) {
                        chararry[0] = String.valueOf((int)(chararry[0].charAt(0)));
                    }
                    if ((j == 1)&&(chararry.length>2)) {
                        tmp = chararry[chararry.length-1];
                        chararry[chararry.length-1] = chararry[1];
                        chararry[1] = tmp;
                    }
                }
                arry[i] = Arrays.toString(chararry).replaceAll("[\\],\\[\\s]", "");
            }

        } str= Arrays.toString(arry).replaceAll("[\\],\\[]", "");;
        return str;
    }
}
