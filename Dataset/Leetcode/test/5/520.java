 class Solution {
    public String XXX(String s) {
        char[] cs = s.toCharArray();
        int maxLen = 1;
        String result = String.valueOf(cs[0]);
        for(int i = 1; i < cs.length; i++){
            int j1 = 1;
            while(i - j1 >= 0 && i + j1 - 1 < cs.length && cs[i - j1] == cs[i + j1 - 1]){
                j1++;
            }
            int j2 = 1;
            while(i - j2 >= 0 && i + j2 < cs.length && cs[i - j2] == cs[i + j2]){
                j2++;
            }
            int len = Math.max((j1 - 1) * 2, (j2 - 1) * 2 + 1);
            if(maxLen < len){
                maxLen = len;
                result = String.valueOf(cs, (len % 2 == 0) ? i - j1 + 1 : i - j2 + 1, len);
            }
        }
        return result;
    }
}

