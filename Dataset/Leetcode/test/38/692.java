 class Solution {
    public String XXX(int n) {
        if(n == 1)
            return "1";
        String s = XXX(n-1);
        char[] chs = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int cnt = 1;
        char prev = chs[0];
        int i = 1;
        for(; i < chs.length; i++) {
            if(chs[i] == prev) {
                cnt++;
            } else {
                sb.append(cnt);
                sb.append(prev);
                cnt = 1;
            }
            prev = chs[i];
        }
        if(i >= chs.length) {
            sb.append(cnt);
            sb.append(prev);
        }
        return sb.toString();
    }
}

