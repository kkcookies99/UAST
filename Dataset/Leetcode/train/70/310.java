class Solution {
    public int XXX(int n) {
        int pointA = 0;
        int pointB = 1;
        int sum = 0;
        for(int i = 0;i<n;i++)
        {
            sum = pointB+pointA;
            pointA = pointB;
            pointB = sum;
        }
        return sum;
    }
}

