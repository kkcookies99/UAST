 class Solution {
    public int XXX(String s) {
            int length = s.length();
            int max = 0;
            int left = 0, right = 0;
            int[] n = new int[128];
            for (int i = 0; i < n.length; i++) {
                n[i] = -1;
            }
            while (right < length){
                if (n[s.charAt(right)] != -1 && n[s.charAt(right)] + 1 > left){
                    left = n[s.charAt(right)] + 1;
                }
                n[s.charAt(right)] = right;
                max = Math.max(max, right - left + 1);
                right++;
            }
            return max;
    }
}

