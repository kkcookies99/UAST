class Solution {
    public int XXX(int n) {
        // 爬上n阶楼梯，f(n) = f(n - 1) + f(n - 2)
        if(n == 1) return 1;
        if(n == 2) return 2;
        int[] arr = new int[n + 1];
        arr[1] = 1; arr[2] = 2;
        for(int i = 3; i <= n; i++){
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }
}

