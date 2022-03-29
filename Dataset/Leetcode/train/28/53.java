 class Solution {
    public int XXX(String haystack, String needle) {
        if(needle.equals("")){
            return 0;
        }
        if(haystack.length()<needle.length()){
            return -1;
        }
        for(int j=0;j<haystack.length()-needle.length()+1;j++){
            boolean flag=true;
            for(int i=j;i<j+needle.length();i++){
            if(haystack.charAt(i)!=needle.charAt(i-j)){
                flag=false;
                break;
                }
            } 
            if(flag){
                return j;
            }
        }
        return -1;
    }
}

