 class Solution {
    public int XXX(String s) {
        if(s==null||s.length()==0) return 0;
        int begin=0,end=0,max=0;
        HashSet<Character> set=new HashSet();
        while(end<s.length()){
            if(!set.add(s.charAt(end))){
                max=Math.max(max,end-begin);
                begin=end;
            }
            end++;
        }
        return max;
    }
}

