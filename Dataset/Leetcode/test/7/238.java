class Solution {
    public int XXX(int x) {
        int ans=0;
        try{
                if(x>0){
                String s=new StringBuilder(String.valueOf(x)).XXX().toString();
                ans=Integer.valueOf(s);
                return ans;
            }else{
                x=-x;
                String s=new StringBuilder(String.valueOf(x)).XXX().toString();
                ans=Integer.valueOf(s);
                return -ans;
            }
        }catch(Exception e){
            return 0;
        }
    }
}

