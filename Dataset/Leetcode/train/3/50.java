 class Solution {
    public int XXX(String s) {
        if(s.length() == 0){
            return 0;
        }

        Set<Character> set = new HashSet<>();
        int left = 0;
        int right = 0;
        int length = 0;
        while( right<s.length()){
            if(set.contains(s.charAt(right))){
                set.remove(s.charAt(left++));
            }else{
                set.add(s.charAt(right++));
            }
            length = set.size()>length ? set.size():length;
        }
        return length;
     }
}

