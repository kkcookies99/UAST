 class Solution {
    public boolean XXX(String s) {
        s = s.toLowerCase();
        int i=0,j=s.length()-1;
        while(i<j){
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);
            if(!isValid(c1)){
                i++;
            }else if(!isValid(c2)){
                j--;
            }else{
                if(c1!=c2){
                    return false;
                }
                i++;j--;
            }
        }
        return i>=j?true:false;
    }
    boolean isValid(char c){
        return (c>='a'&&c<='z')||(c>='0'&&c<='9');
    }
}

