 class Solution {
    public boolean XXX(int x) {
        if(x<0) return false;
        else{
            int temp=x,num=0;
            while(x!=0){
                if(num>214748364||(num==214748364&&num%10>7)) return false;
                num=x%10+num*10;
                x=x/10;
            }
            if(num==temp) return true;
            else return false;
        }
    }
}

