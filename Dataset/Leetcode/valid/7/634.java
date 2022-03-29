 class Solution {
    public int XXX(int x) {
        if(x==0){
            return x;
        }
        if(x<Integer.MIN_VALUE||x>Integer.MAX_VALUE){
            return 0;
        }
        long num=0;
        boolean flag=false;
        if(x<0){
            x=x*(-1);
            flag=true;
        }
        if(x%10==0){
            x=x/10;
        }
        while(x!=0){
            int temp=x%10;
            num=num*10;
            if(num<Integer.MIN_VALUE||num>Integer.MAX_VALUE){
                return 0;
            }
            num+=temp;
            x=x/10;
        }
        if(flag){
            num=num*(-1);
        }
        return (int) num;
    }


