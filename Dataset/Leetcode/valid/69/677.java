class Solution {
    public int XXX(int x) {
        if(x==1)return 1;
        for(int i = x/2;i>0;i--){
            if((i*i)<=x)return i;
        }
        return 0;
    }
}

