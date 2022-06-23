//Сократить строку вида aaabbbssskkk до a3b3s3k3



public class task_02 {
    public static void main(String[] args) {
        System.out.println(encodeString("aaabbbssskkk"));
    }

    public static String encodeString(String decodedString) {
        char[] charString = decodedString.toCharArray();
        String encodedString = "";
        int count = 1;
        for (int i = 0; i < decodedString.length(); i++) {
            if (i < decodedString.length() - 1) {
                if (charString[i] == charString[i + 1]) {
                    count += 1;
                } else {
                    encodedString = encodedString + charString[i] + count;
                    count = 1;
                }
            } else {
                encodedString += charString[i] + String.valueOf(count);
            }
        }
        return encodedString;
    }

}
