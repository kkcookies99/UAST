class Solution {
    public int XXX(int x) {
        if (x<=1)
            return x;
        double r=x;
        while (r > x/r){
            r = (int)((r+ x/r)/2);
        }
        return (int)r;
    }
}

