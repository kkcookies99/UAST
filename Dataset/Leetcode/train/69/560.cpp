class Solution {
public:
    int XXX(int x) {
        int l=0,r=x;
        int ans=0;
        while (l<=r){
            long long mid=(l+r)>>1;
            if (mid*mid<=x){
                l=mid+1;
                ans=mid;
            }else{
                r=mid-1;
            }
        }
        return ans;
    }
};

