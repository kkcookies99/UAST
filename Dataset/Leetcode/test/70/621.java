class Solution {
    public int XXX(int n) {        
        if(n==1) return 1;
        else if(n==2) return 2;
        else{
            int a = 1, b = 2;
            for(int i=1; i<(n+1)/2; i++){
                a+=b;
                b+=a;
            }
            return n%2==0 ? b : a;
        }
    }
}

