class Solution {
    public String XXX(String a, String b) {
        int m = a.length();
        int n = b.length();
        int maxLen = Math.max(m,n);
        int[] res = new int[maxLen+1];
        int[] arrA = new int[m];
        int[] arrB = new int[n];
        for (int i = m - 1, j = 0; i >= 0; i--, j++) {
            arrA[j] = a.charAt(i) - '0';
        }
        for (int i = n - 1, j = 0; i >= 0; i--, j++) {
            arrB[j] = b.charAt(i) - '0';
        }
        int upNum = 0;
        for(int i = 0; i < maxLen; i++) {
            if (i < m && i < n) {
                res[i] = arrA[i] + arrB[i] + upNum;
            } else if (i < m){
                res[i] = arrA[i] + upNum;
            } else{
                res[i] = arrB[i] + upNum;
            }
            if (res[i] == 2) {
                res[i] = 0;
                upNum = 1;
            } else if (res[i] == 3){
                res[i] = 1;
                upNum = 1;
            } else {
                upNum = 0;
            }
        }
        if (upNum == 1) {
            res[maxLen] = 1;
        }

        if (res[maxLen - 1] == 2) {
            res[maxLen - 1] = 1;
            res[maxLen] = 1;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = maxLen; i >= 0; i--) {
            if (i == maxLen && res[i] == 0) {
                continue;
            }
            sb.append(res[i]);
        }
        return sb.toString();
    }
}

