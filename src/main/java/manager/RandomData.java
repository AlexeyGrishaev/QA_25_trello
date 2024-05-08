package manager;

import java.util.Random;

public class RandomData {
    public static String breedOfCats() {
        String[] arr = {"Abyssinian", "Birman", "Egyptian Mau", "Korat",
                "Norwegian Forest Cat", "Russian Blue", "Persian Traditional"};
        return arr[new Random().nextInt(arr.length)];
    }

    public static String randomString(int lenght) {
        StringBuilder strB = new StringBuilder();
        for (int i = 0; i < lenght; i++) {
            strB.append(randomChar());
        }
        return strB.toString();
    }

    private static char randomChar() {
        return (char) ('a' + Math.random() * ('z' - 'a') + 1);
    }
}
