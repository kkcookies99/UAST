class Solution {
    public int XXX(String s) {
        s =s.trim();
        int k=0,j =s.length();
        while(j>0&&s.charAt(j-1)!=' '){
            k++;
            j--;
        }
        return k;
    }
}

