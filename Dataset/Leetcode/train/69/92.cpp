class Solution {
public:
    int XXX(int x) {
        int l=0,r=x>1<<16?1<<16:x;
        long long int temp;
        while(l<=r)
        {
            int mid=(l+r)/2;
            temp=(long long int)mid*mid;
            if(temp<x)l=mid+1;
            else if(temp==x)return mid;
            else r=mid-1;
        }
        return r;
    }
};

