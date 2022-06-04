package lab_06;

/*
String myStr = "100 minutes";
NOT using REGEX, extract digit character from that String
Expected output: "100".
EX: "12345nabc678" -> "12345678"
*/

public class DigitCharacterExtraction {

    public static void main(String[] args) {

        String myStr = "12345nabc678";
        char[] myCharacters = myStr.toCharArray();
        String digitCharacter = "";
        for (char digit : myCharacters) {
            if(Character.isDigit(digit)){
                digitCharacter = digitCharacter + digit;
            }
        }
        System.out.println(digitCharacter);
    }

}
