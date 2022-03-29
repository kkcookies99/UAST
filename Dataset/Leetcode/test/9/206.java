class Solution {
    public boolean XXX(int x) {
        String string = String.valueOf(x);
        StringBuffer buffer = new StringBuffer(string);
        if(string.equals(buffer.reverse().toString())){
            return true;
        }else{
            return false;
        }
    }
}

