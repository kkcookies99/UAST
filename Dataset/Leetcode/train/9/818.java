 class Solution {
    public boolean XXX(int x) {
        if(x<0){
            return false;
        }
        String str = Integer.toString(x);
        String str1 = "";
        for(int i =str.length(); i>0;  i --){
            str1 +=str.substring(i-1,i);
        }
        if(str1.equals(str)){
            return true;
        }
         return false;
    }
}

