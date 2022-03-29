class Solution {
public:
    int XXX(int x) {        
        int left=0;
        int right=x/2+1;
        long mid=0;        // 设为long long类型防止溢出
        while(left<=right){
            mid=(left+right)>>1;
            long y=mid*mid;
            long y1=(mid+1)*(mid+1);
            if(x>=y && x<y1){
                return mid;
            }else if(x>=y1){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return mid;
    }
};

