 class Solution {
    public boolean XXX(int x) {
        String s=String.valueOf(x);
        int i=0,j=s.length()-1;
        while(i!=j&&i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;

    }
}

