class Solution {
    public int XXX(int x) {
        //找到最后一个a*a<=x的a
        long start=0;
         //使用long防止溢出
        long end=65536;//或直接end=x也行，这里是取比x大的一个开方数
        long mid;
        while(start<=end){
            mid=start+((end-start)>>1);
            if(mid*mid>x){
                end=mid-1;
            }else{
                if((mid+1)*(mid+1)<=x){
                    start=mid+1;
                }else{
                    return (int)mid;
                }
            }
        }
        return -1;
    }
}

