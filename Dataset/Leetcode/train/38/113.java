class Solution {
    public String XXX(int n) {
        String str = "1";
        for (int i = 1; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            char[] chs = str.toCharArray();
            int count = 1, j;
            for(j = 1; j < chs.length; j++) {
                if (chs[j] == chs[j - 1]) {
                    count++;
                } else {
                    sb.append(count).append(chs[j - 1]);
                    count = 1;
                }
            }
            sb.append(count).append(chs[j - 1]);
            str = sb.toString();
        }

        return str;
    }
}

