class Solution {
public:
    int XXX(int x) {
        int left=0,right=x;long mid=(left+right)/2;
        while(!(mid*mid<=x&&(mid+1)*(mid+1)>x))
        {
            if(mid*mid<x) 
            {
                left=mid;
                if((left+right)%2==1) 
                    mid=(left+right+1)/2;
                else mid=(left+right)/2;
            }
            else
             {
                right=mid;
                if((left+right)%2==1) 
                    mid=(left+right-1)/2;
                else mid=(left+right)/2;
            }
        }
        return mid;
    }
};

