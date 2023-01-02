import java.util.Arrays;
import java.util.Random;

public class RandomArray {

    public static void main(String[] args) {

        int[] firstArr = getRandomArray(10);
        int[] secArr = getRandomArray(20);
        int[] thirdArr = getRandomArray(30);
        int[] fourthArr = new int[10];
        int[] fifthArr = getRandomArray(10);
        int[] sixthArr = Arrays.copyOf(fifthArr, fifthArr.length);
        int[] seventhArr = getRandomArray(10);

        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {1, 2, 3, 4, 5};

        String[] stringArr = {"bob", "mark", "tim", "kyle"};

        Arrays.fill(fourthArr, 5);
        Arrays.sort(firstArr);
        Arrays.sort(secArr);
        Arrays.sort(thirdArr);
        Arrays.sort(stringArr);
        Arrays.sort(seventhArr);

        int[] reversedSeventh = reverseArray(seventhArr, 10);


        System.out.println(Arrays.toString(firstArr));
        System.out.println(Arrays.toString(secArr));
        System.out.println(Arrays.toString(thirdArr));
        System.out.println(Arrays.toString(fourthArr));
        System.out.println(Arrays.toString(fifthArr));
        System.out.println(Arrays.toString(sixthArr));
        System.out.println(Arrays.toString(seventhArr));
        System.out.println(Arrays.toString(reversedSeventh));

        if (Arrays.binarySearch(stringArr, "tim") >= 0) {
            System.out.println("Found tim in the list");
        }

        if (Arrays.equals(s1, s2)) {
            System.out.println("Arrays are equal");
        }


    }

    private static int[] getRandomArray(int length) {
        Random random = new Random();
        int[] newIntArr = new int[length];

        for (int i = 0; i < length; i++) {
            newIntArr[i] = random.nextInt(100);
        }
        return newIntArr;
    }

    private static int[] reverseArray(int[] arr, int length) {
        int[] reversedArr = new int[length];
        int temp = length;
        for (int i = 0; i < length; i++) {
            reversedArr[temp - 1] = arr[i];
            temp = temp - 1;
        }
        return reversedArr;
    }
}
