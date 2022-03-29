class Solution {
    public int XXX(int x) {
        for(long i=0;i<=x;i++){
            if(i*i<=x&&(i+1)*(i+1)>x){
            return (int)i;
            }
        }
        return 0;

    }
}

