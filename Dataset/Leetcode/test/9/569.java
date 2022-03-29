 class Solution {
    public boolean XXX(int x) {
        if(x<0){
            return false;
        }
        if(x==0){
            return true; 
        }
        long num=0;
        int t=x;
        while(t!=0){
            num=num*10;
            int temp=t%10;
            num+=temp;
            t=t/10;
        }
        if(x==num){
            return true;
        }else{
            return false;
        }
    }
}

