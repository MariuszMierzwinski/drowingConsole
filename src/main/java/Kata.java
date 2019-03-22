public class Kata {
    public Kata() {
    }

    public static String encryptThis(String text) {

        // Implement me! :)
        String word = "";
        String sentence = "";
        String[] arr = text.split(" ");
        if (text.equals("")) return "";
        for (int i = 0; i < arr.length; i++) {

            String str = arr[i].replaceAll("\\d", "");
            String intChar = arr[i].replaceAll("\\D+", "");


            word = (char) (Integer.parseInt(intChar)) + (str.length() > 1 ? str.substring(str.length() - 1, str.length()) + (str.length() > 2 ? str.substring(1, str.length() - 1) : "") + str.substring(0, 1) : str);
            sentence += word + (i<(arr.length-1) ? " ":"");

        }


        return text.length() > 0 ? sentence : "";
    }

}