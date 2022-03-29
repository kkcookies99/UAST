class Solution {
    public int XXX(int n) {
        if(n==1){
            return 1;
        }else if(n==2){
            return 2;
        }else{
            int s1 = 1;
            int s2 = 2;
            int si = 0;
            for(int i=3;i<=n;i++){
                si= s1+s2;
                s1=s2;
                s2=si;
            }
            return si;
        }
        
    }
}

