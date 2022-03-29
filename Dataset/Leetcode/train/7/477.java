 class Solution {
    public int XXX(int x) {
        int a=0;
        while(x!=0){
            if(a>Integer.MAX_VALUE/10||a<Integer.MIN_VALUE/10||(x%10>Integer.MAX_VALUE%10&&a==Integer.MAX_VALUE/10)||(x%10<Integer.MIN_VALUE%10&&a==Integer.MIN_VALUE/10)){
                return 0;
            }
            a=a*10+x%10;
            x/=10;

        }
        return a;
    }
}

