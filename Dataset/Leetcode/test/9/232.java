class Solution {
    public boolean XXX(int x) {
        if(x<0){
            return false;
        }else{
            StringBuilder str1 = new StringBuilder(x);
            String str2 = str1.reverse().toString();
            if(str2.equals(str1.toString())){
                return true;
            }else{
                return false;
            }
        }
    }
}

