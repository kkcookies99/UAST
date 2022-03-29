 class Solution {
    public int XXX(String s) {
        int LastLength=0;
        for (int i=s.length()-1;i>=0;i--){
            if (s.charAt(i)!=' '){
                LastLength+=1;
            }else if (s.charAt(i)== ' ' && LastLength != 0){
                return LastLength;
            }

        }
        return LastLength;
    }
}

