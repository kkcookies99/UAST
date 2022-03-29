 class Solution {
    public int[] XXX(int[] digits) {
        if (f(digits, digits.length - 1) == -1) {
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            return res;
        }
        return digits;
    }

    public int f(int[] arr, int idx) {
        if (arr[idx] != 9) {
            arr[idx]++;
            return 1;
        }
        arr[idx] = 0;
        if (idx == 0) return -1;
        return f(arr, idx - 1);
    }
}

