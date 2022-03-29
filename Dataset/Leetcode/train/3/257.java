 class Solution {
    public int XXX(String s) {
        if(s.length()==0)
            return 0;
        int[] bit=new int[128];
        int left=0;
        int max=0;
        for(int right=0;right<s.length();right++){
            if(bit[s.charAt(right)-'0']>0){
                while(bit[s.charAt(right)-'0']>0){
                    bit[s.charAt(left)-'0']--;
                    left++;
                }
            }
            bit[s.charAt(right)-'0']++;
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}

