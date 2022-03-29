class Solution {
    public int XXX(int x) {
        //找到最后一个a*a<=x的a
        int start=0;
        int end=46340;//31/2=15.5,2^15.5=46340.9,则a必须小于46340.9，否则a相乘溢出为-1
        int mid;
        while(start<=end){
            mid=start+((end-start)>>1);
            if(mid*mid>x){
                end=mid-1;
            }else{
                if(mid+1<=end && (mid+1)*(mid+1)<=x){
                    start=mid+1;
                }else{
                    return mid;
                }
            }
        }
        return -1;
    }
}

