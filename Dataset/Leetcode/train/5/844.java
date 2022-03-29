 class Solution {
    private String res = "";
    public String XXX(String s) {
        // 最长回文子串
        // 字串有两种 奇数与偶数 奇数传起始位置 偶数传两个相邻的起始位置
        for (int i = 0;i<s.length();i++){
            findMaxPalindrome(s,i);
            findMaxPalindrome(s,i,i+1);
        }
        return res;
    }
    public void findMaxPalindrome(String s,int place){
        // 存最长字符串
        String sb = String.valueOf(s.charAt(place));
        int l = place - 1;
        int r = place + 1;
        while (l>=0 && r<=s.length()-1){
            if (s.charAt(l) == s.charAt(r)){
                sb = s.substring(l,r+1);
            } else{
                break;
            }
            l--;
            r++;
        }
        if (sb.length() > res.length()){
            res = sb;
        }
    }
    public void findMaxPalindrome(String s,int l,int r){
        // 存最长字符串
        String sb = new String();
        int temp = 0;
        while (l>=0 && r<=s.length()-1){
            if (s.charAt(l) == s.charAt(r)){
                // 存最长字符串
                 sb = s.substring(l,r+1);
            }else{
                break;
            }
            l--;
            r++;
        }
        if (sb.length() > res.length()){
            res = sb;
        }
    }
}```

