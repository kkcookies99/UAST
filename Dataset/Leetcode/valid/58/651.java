class Solution {
    public int XXX(String s) {
        int count = 0;
        if(s.length()==0) return 0;
        else{
            int i=s.length()-1;
            while(s.charAt(i)==' ' && i>0){
                i--;
            }
            if(s.charAt(i)!=' ') {
                while(i>=0 && s.charAt(i)!=' ' ){
                    i--;
                    count++;
                }
            }
        }
        return count;
    }
}

