class Solution {
public:
    int dic(int x,int left,int right)
    {
        if(left>right)
        {
            return right; 
        }
        long long mid=left+(right-left)/2;
        long long mid2=pow(mid,2);
        if(mid2==x)
        {
            return mid;
        }
        else if(mid2>x)
        {
            right=mid-1;
        }
        else if(mid2<x)
        {
            left=mid+1;
        }
        return dic(x,left,right);
    }
    int XXX(int x) {
        return dic(x,0,x);
    }
};

