 class Solution {
    public int XXX(String s) {
        HashSet<Character> set=new HashSet<>();
        int len=s.length();
        int res=0;
        int l=0;
        int r=0;
        while(l<len&&r<len){
            if(!set.contains(s.charAt(r))){
                set.add(s.charAt(r));
                r++;
                res=Math.max(res,r-l);
                
            }
            else{
                set.remove(s.charAt(l));
                l++;
            }
        }
        return res;
    }
}

