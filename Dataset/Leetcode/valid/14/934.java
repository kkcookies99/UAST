 class Solution {
    public String XXX(String[] strs) {
        if(strs.length == 0) return "";
        String ans = strs[0];
        for (int i = 1; i < strs.length; i++) {
            for (int j = 0; j < strs[i].length() && j < ans.length(); j++) {
                if (ans.charAt(j) == strs[i].charAt(j)){
                    continue;
                } else {
                    if (j == 0) return "";
                    ans = ans.substring(0,j);
                    break;
                }
            }
            ans = ans.length() > strs[i].length() ? strs[i] : ans;
        }
        return ans;
    }
}

