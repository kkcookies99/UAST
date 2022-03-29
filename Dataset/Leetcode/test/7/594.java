 class Solution {
    public int XXX(int x) {
        int result=0;
        try{
            result=Integer.parseInt(new StringBuilder(x>0?(x+""):(x+"").replace("-","")).XXX().toString());
        }catch(NumberFormatException e){}
        return x>0?result:result*(-1);
    }
}

