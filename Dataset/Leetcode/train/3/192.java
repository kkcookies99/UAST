 class Solution {
    public int XXX(String s) {
     int max = 0;
        int from =0;
        for (int i=0;i<s.length();i++){
            char c =s.charAt(i);
            for(int j=from;j<i;j++){
                if(s.charAt(j)==c){
                    from=j+1;
                }
            }
            if((i+1-from)>max){
                max=(i+1-from);
            }
        }
        return max;
    }
}

