class Solution {
    public int XXX(String s) {
        s=s.trim();
        int j=s.length()-1,i=0;
        while(j>=0 && s.charAt(j)!=' '){
            j--;
            i++;
        }
        return i;
    }
}

