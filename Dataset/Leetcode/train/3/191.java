 class Solution {
    public int XXX(String s) {
        int maxValue = 0;
        for(int i = 0;i < s.length();i++){
            for(int j = i+1;j <= s.length();j++){
                if(Unique(s,i,j)){
                    maxValue = Math.max(maxValue,j-i);
                }
            }
        }
        return maxValue;
    }

    public boolean Unique(String s,int start,int end){
        Set<Character> set = new HashSet<Character>();
        for(int i = start; i < end;i++){
            set.add(s.charAt(i));
        }
        if(set.size() == (end - start)){
            return true;
        }else{
            return false;
        }
    }
}

