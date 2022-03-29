 class Solution {

    String res = "";
    int max = 0;
    public String XXX(String s) {

        int len = s.length();

        for(int i = 0 ; i < len; i++){
            
            // 以自己为中心从两边开始扩展
            lengthOfSubstring(s, i - 1, i + 1);

            // 以自己为左边界扩展
            lengthOfSubstring(s, i, i + 1);
        }

        return res;


    }

    public void lengthOfSubstring(String s, int left, int right){

        // 现在就判断完了
        while(left >= 0 && right <= s.length() - 1 && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }

        // 这个变化还是比较关键的地方
        right--;
        left++;

        int len;
        if((len = right - left + 1) > max){
            max = len;
            res = s.substring(left, right + 1);
        }

    }

}

