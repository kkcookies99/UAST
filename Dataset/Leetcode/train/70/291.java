class Solution {
    public int XXX(int n) {
        int a = 1;
        int b = 1;
        for(int i = 2 ; i <= n ; i ++ )
        {
            b += a;
            a = b-a;
        }
        return b;
    }
}

