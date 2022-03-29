class Solution {
public:
    int XXX(int x) {//二分法
        if(x==0||x==1) return x;
        if(x<0) return -1;
        int mid,start=1,end=x;
        while(start<=end){
            mid=start+(end-start)/2;
            if(x/mid<mid){
                end=mid-1;
            }else if(x/mid>mid){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return end;
    }
};

