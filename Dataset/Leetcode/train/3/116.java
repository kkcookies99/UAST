 class Solution {
    public int XXX(String s) {
        int ans = 0,len = s.length();
        int[] window = new int[128];
        int left = 0,right = 0;

        while(right < len){
            char c = s.charAt(right++);
            window[c]++;
            while(window[c] > 1){
                char d = s.charAt(left++);
                window[d]--;
            }
            ans = Math.max(ans,right - left);
        }
        return ans;
    }
}

