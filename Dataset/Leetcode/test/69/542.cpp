class Solution {
public:
    int XXX(int x) {
        if (x < 0) return -1 ;
        else if (x < 2) return x ; 
        int i , cir = x >> 1 ;
        int fir = 1 , sec = cir , mid ;
        while (fir <= sec)
        {
            mid = (sec + fir) >> 1 ; 
            if (x / mid == mid && x % mid == 0) return mid ;
            else if (x / mid > mid || (x / mid == mid && x % mid != 0)) fir = mid + 1 ;
            else sec = mid - 1 ;
        }
        return fir - 1 ;
        
    }
};```

