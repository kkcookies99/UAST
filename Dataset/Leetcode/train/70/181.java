class Solution {
    public int XXX(int n) {
        int a,b=1,c=1;
        for(int i=2;i<n+1;i++)
        {
            a=c;
            c+=b;
            b=a;
        }
        return c;
    }
}