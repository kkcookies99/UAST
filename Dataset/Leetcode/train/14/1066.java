 class Solution {
    public String XXX(String[] strs) {
        int n = strs.length;
        if(n == 0) return "";
        if(n == 1) return strs[0];
        StringBuilder re = new StringBuilder();
        for(int i = 0;i < strs[0].length();i++){
            if(i >= strs[0].length()) break;
            char c = strs[0].charAt(i);
            for(int j = 1;j < n;j++){
                if(i >= strs[j].length() || strs[j].charAt(i) != c) return re.toString();
            }
            re.append(c);
        }
        return re.toString();
    }
}

