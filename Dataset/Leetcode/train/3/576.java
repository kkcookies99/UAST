 class Solution {
    public int XXX(String s) {
       Map<Integer, Character> map = new HashMap<>();
        int n = s.length();
        int r = 0,l=0;
        int i=0,ans = 0;
        while (i<n){
            if(!map.containsValue(s.charAt(i))){
                map.put(r, s.charAt(i));
                r++;
                i++;
            }else {
                map.remove(l++);
                if(map.size()==0){
                    r=0;
                    l=0;
                }
            }
            ans = Math.max(ans,r-l);
        }
        return ans;
    }
}

