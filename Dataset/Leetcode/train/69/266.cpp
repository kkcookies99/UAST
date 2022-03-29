class Solution {
public:
    int XXX(int x) {
        int left=0,right=x;
        if(!x)return 0;
        while(left<=right)
        {   int mid=(left-right)/2+right;
            if(x/mid==mid)return mid;
            else if(x/mid>mid)left=mid+1;
            else right=mid-1;
        }
        return right;
    }
};

