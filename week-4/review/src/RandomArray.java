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

        Arrays.fill(fourthArr, 5);

        Arrays.sort(firstArr);
        Arrays.sort(secArr);
        Arrays.sort(thirdArr);

        System.out.println(Arrays.toString(firstArr));
        System.out.println(Arrays.toString(secArr));
        System.out.println(Arrays.toString(thirdArr));
        System.out.println(Arrays.toString(fourthArr));
        System.out.println(Arrays.toString(fifthArr));
        System.out.println(Arrays.toString(sixthArr));


    }

    private static int[] getRandomArray(int length) {
        Random random = new Random();
        int[] newIntArr = new int[length];

        for (int i = 0; i < length; i++) {
            newIntArr[i] = random.nextInt(100);
        }
        return newIntArr;
    }
}
