package codewarseKata;


public class MexicanWave {
    public static String[] wave(String str) {
        String[] arr = new String[str.replaceAll("\\s+","").length()];
        int iterator=0;
        for (int i = 0; i < str.length(); i++) {
            str.toLowerCase();
            char[] tym = str.toCharArray();

            if (tym[i] != (' ')) {
                tym[i] = Character.toUpperCase(tym[i]);
                arr[iterator] = String.valueOf(tym);
                iterator++;
            }
        }
        return arr;

    }
}