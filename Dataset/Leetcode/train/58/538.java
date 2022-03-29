class Solution {
    public int XXX(String s) {
        int temp=0,l=0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) != ' '){
                temp++;
                l = temp;
            }else{
                temp = 0;
            }
        }
        return l;
    }
}

