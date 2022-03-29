class Solution {
    public String XXX(int n) {
        if (n == 1) return "1";
        String s = XXX(n - 1);
        String res = getRes(s);
        return res;
    }

    public String getRes(String s) {
        String str = s + "0";
        char[] ch = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        int left = 0;
        for (int i = 1; i < ch.length; i++) {
            if (ch[i] != ch[i - 1]) {
                sb.append(i - left).append(ch[i - 1]);
                left = i;
            }
        }
        return sb.toString();
    }
}

