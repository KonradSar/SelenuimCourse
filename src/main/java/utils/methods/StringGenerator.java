package utils.methods;

import utils.variables.GlobalVariables;

import java.util.Random;

public class StringGenerator {
    public static String generateRandomString(int numberOfChar) {
        //generating a -n elements random String consisted of charArray letters
        char[] charArray = "abcdefghijklłmnoprstuwxyz".toCharArray();
        StringBuilder stringBuilder = new StringBuilder(numberOfChar);
        Random random = new Random();
        for (int i = 0; i < numberOfChar; i++) {
            char phraseForGoogleSearcher = charArray[random.nextInt(charArray.length)];
            stringBuilder.append(phraseForGoogleSearcher);

        }
        GlobalVariables.stringValue = stringBuilder.toString() + " - Szukaj w Google";
        return stringBuilder.toString();

    }
}
