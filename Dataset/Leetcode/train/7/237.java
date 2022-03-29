class Solution {
    public int XXX(int x) {
        if(x==-2147483648||x==0)
            return 0;
        int a=x>0?1:-1;
        x*=a;
        while(x%10==0)
            x/=10;
        String str=(new StringBuilder(x+"")).XXX().toString();
        if(Long.parseLong(str)>2147483647)
            return 0;
        return Integer.parseInt(str)*a;
    }
}

