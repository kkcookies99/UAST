class Solution {
    public int XXX(int[] height) {
        int[] arr = height;
        if(arr == null || arr.length < 2) return 0;
        if(arr.length == 2) return Math.min(arr[0], arr[1]);
        int L = 0;
        int R = arr.length - 1;
        int res = 0;
        while (L < R) {
            res = Math.max(res, Math.min(arr[L], arr[R]) * (R - L));
            if (arr[L] < arr[R]) {
                L++;
            } else if (arr[L] > arr[R]) {
                R--;
            } else {
                L++;
                R--;
            }
        }
        return res;
    }
}

