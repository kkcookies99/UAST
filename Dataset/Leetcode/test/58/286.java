 class Solution {
    public int XXX(String s) {
        int max=0;
        for (int i= s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                max=i;
                break;
            }
        }
        int min=-1;
        for(int i=max;i>=0;i--){
            if(s.charAt(i)==' '){
                min=i;
                break;
            }
        }
        return max-min;
    }
}

