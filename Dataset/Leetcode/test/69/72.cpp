class Solution {
public:
    int XXX(int x) {
        if(x==1){
            return 1;
        }

        long lowerBound = 0;
        long upperBound = x;
        long mid;

        while(lowerBound<=upperBound){
            mid = (lowerBound+upperBound)/2;
            if(mid*mid==x){
                return mid;
            }
            else if(mid*mid>x){
                upperBound = mid-1;
            }
            else{
                lowerBound = mid+1;
            }
        }

        return lowerBound-1;


    }
};

