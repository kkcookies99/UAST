 class Solution {
    public String XXX(String[] strs) {
        if(strs.length < 1) return "";
        String com = strs[0];
        for(int i = 1; i < strs.length; i++){
            int len = Math.min(strs[i].length(), com.length());
            int j;
            for(j = 0; j < len; j++)
                if(strs[i].charAt(j) != com.charAt(j)) break;
            if(j == 0) return "";
            com = com.substring(0, j);
        }
        return com;
    }
}

