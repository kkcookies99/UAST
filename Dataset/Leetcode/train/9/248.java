class Solution {
    public boolean XXX(int x) {
        String s = String.valueOf(x);
        String reverse = new StringBuffer(s).reverse().toString();
        if(s.equals(reverse)){
            return true;
        }else{
            return false;
        }
    }
}

