class Solution {
    public int XXX(int x) {
        long j = 0;
        while(j*j <= x && j <=x/2 + 1){
            if(j*j == x) return (int)j;
            j++;
        }
        return (int)j-1;
    }
}

