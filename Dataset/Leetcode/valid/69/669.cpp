class Solution {
public:
    int XXX(int x) {
        int l=0,r=x,mid;
        if(x==0||x==1) return x;
        while(l<=r){
            mid=(l+r)/2;
            if(mid<x/mid) l=mid+1;
            else if(mid>x/mid) r=mid-1;
            else if(mid==x/mid) return mid;   
        }
        return r;
    }
};

