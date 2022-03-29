 class Solution {
    public int XXX(String s) {
        int len = s.length();
        if(len == 0){
            return 0;
        }
        int[] window = new int[128];
        int left = 0, right = 0;
        int size = 0;
        while(right < len){
            char c = s.charAt(right);
            while(window[c] > 0){
                window[s.charAt(left)]--;
                left++;
            }
            window[c]++;
            size = Math.max(size, right - left + 1);
            right++;
        }
        return size;
    }
}

