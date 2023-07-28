import java.util.Arrays;

class Answer {
    public int[] subArrays(int[] a, int[] b){
        int[] c = new int[] c;
            int min = Math.min(a.length, b.length);
            int max = Math.max(a.length, b.length);
            if (min < 1) {
                throw new RuntimeException("Один из массивов пуст");
            }
            if (min < max) {
                throw new RuntimeException("Длинны массивов не равны!");
            }
            for (int i = 0; i < min; i++) {
                res.add(a[i] - b[i]);
            }
            return res;
