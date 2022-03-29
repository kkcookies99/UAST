class Solution {
  public static int XXX(String s) {
    boolean[] contain = new boolean[256];
    int n = s.length();
    int left =0 , right = 0, max = 0;
    while(right < n){
        while(right < n && !contain[s.charAt(right)]){
            contain[s.charAt(right)] = true;
            right++;
        }

        max = Math.max(max, right - left);
        while(left < n && right < n){
            contain[s.charAt(left)] = false;
            if(s.charAt(left++) == s.charAt(right))
                break;
        }
    }
    return max;
}

