 class Solution {

    public String XXX(String s) {
        if(s.length() < 2)
            return s;
        int start = 0, end = 0;
        for(int i = 0; i < s.length(); i++){
            int len1 = expandAroundCenter(s, i, i);//以一个点为中心向两边扩散
            int len2 = expandAroundCenter(s, i, i+1);//以两个点为中心向两边扩散
            int len = Math.max(len1,len2);
            if(len > end - start){
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end+1);
    }
    
    private int expandAroundCenter(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right - left - 1;
    }
}

