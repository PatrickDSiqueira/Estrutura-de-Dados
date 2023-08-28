package aula1;

import java.util.Random;

public class Pratica {
    public static void main(String[] args) {

        int numberList[] = new int[1000];

        numberList = generateNumber(numberList.length);

        int numberForLooking = getRandomNumber(numberList);

        numberList = organizeNumbers(numberList);

        System.out.println(loookingNumber(numberForLooking, numberList));
    }

    private static int[] generateNumber(int length) {

        int[] numberList = new int[length];
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            numberList[i] = random.nextInt();
        }

        return numberList;
    }

    private static int[] organizeNumbers(int[] numberList) {

        int length = numberList.length;

        for (int i = 0; i < length; i++) {

            for (int j = 0; j < (length - 1); j++) {

                if (numberList[j] > numberList[j + 1]) {

                    int aux = numberList[j];
                    numberList[j] = numberList[j + 1];
                    numberList[j + 1] = aux;
                }
            }
        }

        return numberList;
    }

    /**
     * @param numberList
     * @return
     */
    private static int getRandomNumber(int[] numberList) {

        Random random = new Random();

        int length = numberList.length;

        return numberList[random.nextInt(length)];
    }

    private static String loookingNumber(int numberForLooking, int[] numberList) {

        int beggin = 0;
        int end = numberList.length;
        int mid = 0;

        while (beggin <= end) {

            mid = (beggin + end) / 2;

            int middleNumber = numberList[mid];

            if (middleNumber == numberForLooking) {

                return " I found the number, its in position " + mid + " at number list";
            }

            if (numberForLooking < middleNumber) {

                end = mid;

            } else {

                beggin = middleNumber;
            }
        }

        return "Number not found in this number list";
    }
}
