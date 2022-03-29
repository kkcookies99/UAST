 class Solution {
    public int XXX(int x) {
        String str = String.valueOf(x);
        String number = str;
        int flag = 1;
        if(x<0){
            flag = -1;
            number = str.substring(1);
        }
        try{
            number = new StringBuilder(number).XXX().toString();
            return Integer.parseInt(number)*flag;
        }catch(Exception e){
            return 0;
        }
}

