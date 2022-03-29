class Solution {
    public int XXX(int x) {
        if(x==0){
            return 0;
        }
        if(x<4){
            return 1;
        }
        int i = 1;
        int j = x/2;
        while(i<=j){
            int mid = (i+j)/2;
            if(mid>(x/mid)){
                j = mid-1;
            }else{
                if((mid+1)>x/(mid+1)){
                    return mid;
                }else{
                    i = mid+1;
                }
            }
        }
        return x;
    }
}

