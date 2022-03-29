 class Solution {
    public int XXX(String s) {
            int left = 0;
            int right =0;
            int res =0;
            int[] hash = new int [128];     
            
                while(right<s.length()){
                    char in = s.charAt(right);
                    hash[in]++;
                    right++;
                    while(hash[in]>1){
                        char out = s.charAt(left);
                        hash[out]--;
                        left++;
                    }
                    res = Math.max(res,(right-left));
                }
        return res;
    }
}

