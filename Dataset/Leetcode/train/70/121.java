class Solution {
    int[] buffer;
    int recClimb(int n){
        if (buffer[n]!=0)
            return buffer[n];
        buffer[n] = recClimb(n-1)  + recClimb(n-2);
        return buffer[n];
    }
    public int XXX(int n) {
        if(n==1)
            return 1;
        buffer = new int[n];
        buffer[1] = 1;
        buffer[0] = 1;
        return (recClimb(n-1)  + recClimb(n-2));
    }
}

