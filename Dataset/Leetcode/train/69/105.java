class Solution {
    public int XXX(int x) {
        //for(int i=0;i<=x;i++)
        for(long i=1;i<=x;i++){
            if(i*i>x){
                return (int)(i-1);
            }else if(i*i==x){
                return (int)i;
            }
        }
        return 0;

    }
}


