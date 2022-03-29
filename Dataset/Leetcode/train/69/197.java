class Solution {
    public int XXX(int x) {
        int i=0,j;
        while(true){
            j=i+1;
            if((long)i*i<=x&&(long)j*j>x){
                break;
            }
            i++;
        }
        return i;
    }
}

