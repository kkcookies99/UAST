class Solution {

    public String XXX(int n) {
        if (n == 1) return "1";
        if (n == 2) return "11";
        if (n == 3) return "21";
        if (n == 4) return "1211";
        String s = XXX(n - 1);
        //对s进行描述
        StringBuilder sb = new StringBuilder();
        char c = s.charAt(0);
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == c) count++;
            else {
                sb.append(count).append(c);
                count = 1;
                c = s.charAt(i);
            }
        }
        sb.append(count).append(c);
        return sb.toString();
    }
}

