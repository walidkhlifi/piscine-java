public class ComputeArray {

    public static int[] computeArray(int[] array) {

        int[] res = new int[array.length];
        int index = 0;

        for (int i : array) {

            if (i % 3 == 0) {
                res[index] = i * 5;
            } else if ((i - 1) % 3 == 0) {
                res[index] = i + 7;
            } else {
                res[index] = i;
            }

            index++;
        }

        return res;
    }
}