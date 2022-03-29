class Solution {
    public int XXX(int x) {
        if(x==0)
        return 0;
        int target=0;
        for(target=1;;target++){
            int temp=target+1;
            int a=x/target;
            int b=x/temp;
            if(a>=target&&b<temp)
            return target;
        }
    }
}

