class Solution {
    public int XXX(int n) {
        if(n==1) return 1;
        if(n==2) return 2;
        int pre1=1,pre2=2;
        int ans=0;
        int c=3;
        while(c<=n){
            ans=(pre1+pre2);
            pre1=pre2;
            pre2=ans;
            c++;
        }
        return ans;
    }
}

