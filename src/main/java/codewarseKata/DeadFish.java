package codewarseKata;

public class DeadFish {
    public static int[] parse(String str) {
        int value=0,l = 0;
        int[] output = new int[(int)str.chars().filter(i->i=='o').count()];


        for (int i = 0; i < str.length() ; i++) {

            switch(str.charAt(i)){
                case 'i' :{
                    value++;
                    break;
                }
                case 'd' :{
                    value--;
                    break;
                }
                case 's' :{
                    value=(int)Math.pow(value,2);
                    break;
                }
                case 'o' :{
                    output[l]=value;
                    l++;
                    break;
                }
                default:{
                    break;
                }
            }

        }return output;
    }
}
