 class Solution {
    public int XXX(String s) {
        Set<Character> set = new HashSet<>();
        int n = s.length(), ans = 0;
        
        for(int i = 0, j = 0; i < n; ++i){
            char c = s.charAt(i);
            if(!set.contains(c))
                set.add(c);
            else{
                while(s.charAt(j) != c){
                    set.remove(s.charAt(j));
                    j++;
                }
                j++;
            }
            ans = Math.max(ans, set.size());
        }
        return ans;
    }
}

