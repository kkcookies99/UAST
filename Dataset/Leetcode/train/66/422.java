class Solution {
    public int[] XXX(int[] digits) {
        int max = digits.length - 1;
        return deeploop(digits, max);

    }

    public int[] deeploop(int[] d, int plus) {
        while (plus > 0) {
            if (d[plus] == 9) {
                d[plus] = 0;
                plus-=1;
            } else {
                d[plus]++;
                break;
            }

        }
        if (plus == 0) {
            d[plus] ++;
        }
        if (d[plus] >= 10 ) {
            int[] x = Arrays.copyOf(d, d.length + 1);
            x[0] = 1;
            x[x.length - 1] = 0;
            return x;
        }
        return d;
    }
}

