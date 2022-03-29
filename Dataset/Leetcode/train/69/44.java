class Solution {
    public int XXX(int x) {
        if(x==0)
        return 0;
        long sqrt=x;
        while(x/sqrt<sqrt)
        {
            sqrt=(sqrt+x/sqrt)/2;
        }
        return (int)sqrt;
    }
}

