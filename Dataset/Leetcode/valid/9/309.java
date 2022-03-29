class Solution {
    public boolean XXX(int x) {
        if(x==0){
            return true;
        }
        String str = String.valueOf(x);
        String result = new StringBuilder(str).reverse().toString();
        return result.equals(str)?true:false;
    }
}

