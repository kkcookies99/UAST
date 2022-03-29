class Solution {
    public int XXX(int x) {
        String s="";
        if(x>0){
            s=new StringBuffer(String.valueOf(x)).XXX().toString();
        }else if(x<0){
            s="-"+new StringBuffer(String.valueOf(-x)).XXX().toString();
        }
        try{
            x=Integer.valueOf(s);
        }catch (Exception e){
            x=0;
        }

        return x;
    }
}

