class Solution {
public:
    int XXX(int x) {
        //不会超过它的一半
        int low = 0;
        int high = min(x / 2 + 1,46340);
        while(low <= high){
            int middle = (low + high) / 2;
            if((middle * middle) > x){
                high = middle - 1;
                continue;
            }else if((middle * middle) == x){
                return middle;
            }else{
                low = middle + 1;
                continue;
            }
        }
        return high;
    }
};

