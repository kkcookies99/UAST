class Solution {
public:
    int XXX(int x) {
        if(x==0) return 0;
        if(x==1) return 1;
        int left=0,right=x-1;
        int mid;
        while(left<=right){
            long long mid=(left+right)/2;
            long long midsqur=mid*mid;
            if(midsqur==x) return mid;
            if(midsqur<x) left=mid+1;
            else right=mid-1;
        }
        return left-1;
    }
};

