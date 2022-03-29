class Solution {
    public boolean XXX(int x) {
        String s = String.valueOf(x);
        char[] sr = s.toCharArray();
        int i = 0;
        int j = s.length()-1;
        while(i < j) {
            if(sr[i] != sr[j]){
                return false;
            }
            i++;
            j--;
        } 
        return true;
    }
}

