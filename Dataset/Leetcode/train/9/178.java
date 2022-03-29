class Solution {
    public boolean XXX(int x) {
        Integer tmp = x;
        String s = tmp.toString();
        if(s.equals(new StringBuilder(s).reverse().toString())){
            return true;
        }else{
            return false;
        }
    }
}

