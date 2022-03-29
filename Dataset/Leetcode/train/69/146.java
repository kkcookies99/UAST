class Solution {
    public int XXX(int x) {
        int i;
        if(x==1){
            return 1;
        }
        for(i=1;i<x;i++){
            if((long)i*i>x){
                break;
            }
        }
        return i-1;
   }
}

