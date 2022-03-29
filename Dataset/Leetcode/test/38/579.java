 class Solution {
    public String XXX(int n) {

        if (n == 1) {
            return 1 + "";
        }
        String pre = XXX(n - 1);
        char[] arr = pre.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; ) {
            char tmp = arr[i];
            int cnt = 1;
            for (int j = i + 1; j < arr.length; ++j) {
                if (arr[j] != tmp) {
                    break;
                }
                cnt++;
            }
            sb.append(cnt);
            sb.append(tmp);
            i += cnt;
        }
        return sb.toString();
    }
}

