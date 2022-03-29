class Solution {
    public String XXX(String a, String b) {

        boolean flag = a.length() >= b.length();
        char[] arr1 = flag ? a.toCharArray() : b.toCharArray();
        char[] arr2 = !flag ? a.toCharArray() : b.toCharArray();

        int overflow = 0;
        for (int i = arr2.length - 1, j = arr1.length - 1; i >= 0; --i, --j) {
            int v1 = arr1[j] - '0';
            int v2 = arr2[i] - '0';
            int tmp = v1 + v2 + overflow;
            if (tmp > 1) {
                arr1[j] = (char) (tmp % 2 + '0');
                overflow = 1;
            } else {
                arr1[j] = (char) (tmp + '0');
                overflow = 0;
            }
        }
        for (int i = arr1.length - arr2.length - 1; i >= 0; --i) {
            int v1 = arr1[i] - '0';
            int tmp = v1 + overflow;
            if (tmp > 1) {
                arr1[i] = (char) (tmp % 2 + '0');
                overflow = 1;
            } else {
                arr1[i] = (char) (tmp + '0');
                overflow = 0;
            }
        }

        if (overflow == 1) {
            return "1" + String.valueOf(arr1);
        }
        return String.valueOf(arr1);
    }
}

