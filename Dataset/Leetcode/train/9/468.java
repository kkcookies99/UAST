 class Solution {
    public boolean XXX(int x) {
        int result = 0,temp=x;
        if(x<0){
            return false;
        }
        while(temp!=0){
            result=result*10+temp%10;
            temp /= 10;
        }
        if(result==x){
            return true;
        }else{
            return false;
        }
    }
}

