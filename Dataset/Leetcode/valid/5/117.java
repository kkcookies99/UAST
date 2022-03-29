 class Solution {
    public String XXX(String s) {
        int maxSize=0;
        String res="";
        for (int i = 0,j=i; i < s.length(); i++) {
            while (j<s.length()){
                if (isPalindrome(s,i,j)&&j-i+1>maxSize){
                    maxSize=j-i+1;
                    res=s.substring(i,j+1);
                }
                j++;
            }
            if (i+maxSize-1>=s.length()){
                return res;
            }else {
                j=i+maxSize+1;
            }
        }
        return res;
    }
    private boolean isPalindrome(String s, int i, int j) {
        while (i<j){
            if (s.charAt(i++)!=s.charAt(j--))return false;
        }
        return true;
    }
}

