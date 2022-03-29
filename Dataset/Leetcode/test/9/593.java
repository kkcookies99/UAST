 class Solution {
    public boolean XXX(int x) {
        if(x<0)return false;
        int num = x;
        int res =0;
        while(num!=0){
            res = res*10 +num%10;
            num =num/10;
        }
        return (res==x) ? true :  false;
    }
}

