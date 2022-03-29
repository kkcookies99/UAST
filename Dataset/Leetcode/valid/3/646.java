 class Solution {
    public int XXX(String s) {
        if("".equals(s)){
            return 0;
        }
        char[] ch = s.toCharArray();
        int len = ch.length;
        int maxLength = 0;
        for (int i = 0; i < len-1; i++) {
            for (int j = i+1; j < len; j++) {
                if (ch[i] == ch[j]){
                    int max = j-i;
                    if (max > maxLength){
                        maxLength = max;
                    }
                    break;
                }
            }
        }
        return maxLength;
    }
}

