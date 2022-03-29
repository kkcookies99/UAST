 class Solution {
    public boolean XXX(int x) {
        StringBuffer b=new StringBuffer(String.valueOf(x));
        String reverse = String.valueOf(b.reverse());
        if(String.valueOf(x).equals(reverse)){
            return true;
        }else{
            return false;
        }
    }
}

