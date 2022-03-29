class Solution {
    public int XXX(int x) {
       int left=0,right=x/2+1;
       int ret=0;
       while(left<=right){
           int mid=left+((right-left)>>1);
           if((long)mid*mid<=x){
               ret=mid;
               left=mid+1;
           }else{
               right=mid-1;
           }
       }
       return ret;
    }
}

