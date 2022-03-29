 class Solution {
    public boolean XXX(int x) {
        String aaa = String.valueOf(x);
        int p1 = 0,p2 = aaa.length()-1;
        while(p1<p2){
            if(aaa.charAt(p1)==aaa.charAt(p2)){
                p1++;
                p2--;
            }else{
                return false;
            }
        }
        return true;
    }
}

