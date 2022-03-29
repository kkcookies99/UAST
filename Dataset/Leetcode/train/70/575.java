class Solution {
    public int XXX(int n) {
        if(n==1||n==2) return n;
        int a=1,b=2,temp=0;
        for(int i=2;i<n;i++){
            temp=a+b;
            a=b;
            b=temp;
        }
        return b;
    }
}

