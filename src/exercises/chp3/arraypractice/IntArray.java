package exercises.chp3.arraypractice;

public class IntArray {
    public static void main(String[] args) {
        int[] singleArray = {1, 1, 2, 3, 5, 8};

        for (int i = 0; i < singleArray.length; i++) {
            if (singleArray[i] % 2 != 0) {
                System.out.println(singleArray[i]);
            }
        }

    }
}
