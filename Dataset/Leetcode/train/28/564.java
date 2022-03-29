 class Solution {
    public int XXX(String haystack, String needle) {
    int j = 0;
    int k = -1;    
    if(needle.length()==0){
        k = 0;
    }else{
        for (j=0;j<=haystack.length()-needle.length();j++){
                if(needle.equals(haystack.substring(j,j+needle.length()))){
                    k = j;
                    break;
                }
            }
    }      
    return k;
    }
}

