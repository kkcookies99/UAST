class Solution {
public:
    int XXX(int x) {
        if(x<=1)return x;
        int l=0,r=x;
        while(l<r-1){
            int mid = (l+r)>>1;
            if(x / mid == mid)return mid;
            else if(x / mid > mid)l=mid;
            else r=mid;
        }
        return l;
    }
};

