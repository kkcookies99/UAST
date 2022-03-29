class Solution {
    public int XXX(int x) {
        long start=0;
        long end=(int) Math.pow(2,17)-1;
        while(start<=end){
            long mid=(start+end)/2;
            if(mid*mid>x && x>=(mid-1)*(mid-1)){
                return (int)mid-1;
            }else if(x>mid*mid){
                start=mid+1;
            }else if(x<(mid-1)*(mid-1)){
                end=mid-1;
            }else{
                return (int)mid;
            } 
        }
        return -1;
    }
}

