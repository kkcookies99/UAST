class Solution {
    public int XXX(int n) {
        if(n==1)
            return 1;
        else if(n==2)
            return 2;
        else{
                int[]num=new int[n+1];
            num[1]=1;
            num[2]=2;
            for(int i=3;i<=n;++i)
                num[i]=num[i-1]+num[i-2];
            return num[n];
        }
           
    }
}

