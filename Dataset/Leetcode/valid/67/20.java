 class Solution {
    public String XXX(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int p = 0;//进位
        StringBuilder sb = new StringBuilder("");
        while (i >= 0 && j >= 0) {
            int ai = a.charAt(i) - '0';
            int bj = b.charAt(j) - '0';
            sb.append((ai + bj + p) % 2);
            p = (ai + bj + p) / 2;//更新进位
            --i;
            --j;
        }
        while (i >= 0) {
            int ai = a.charAt(i) - '0';
            sb.append((ai + p) % 2);
            p = (ai + p) / 2;
            --i;
        }
        while (j >= 0) {
            int bj = b.charAt(j) - '0';
            sb.append((bj + p) % 2);
            p = (bj + p) / 2;
            --j;
        }
        if (p == 1) sb.append(1);
        sb.reverse();
        return sb.toString();
    }
}

