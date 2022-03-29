class Solution {
    public boolean XXX(int x) {
        String str_x,str_y;
        str_x=Integer.toString(x);
        str_y=new StringBuffer(str_x).reverse().toString();
        if(str_x.equals(str_y)){
            return true;
        }else{
            return false;
        }

    }
}

