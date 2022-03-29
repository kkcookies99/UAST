class Solution {
public:
    int XXX(int x) {
        if(x==0)
            return 0;
        if(x<4)
            return 1;
        if(x==4||x==5)
            return 2;  

        int l=2, r=x/2; //一定介于两者之间
        while(l<=r){
            long long mid = (l+r)/2;
            if(mid*mid==x)
                return mid;
            else if(mid*mid<x)
                l = mid+1;
            else 
                r = mid-1;        
        }
        return r;

    }
};

