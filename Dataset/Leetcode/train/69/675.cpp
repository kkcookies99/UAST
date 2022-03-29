class Solution {
public:
    int XXX(int x) {
        int i = 1;
        for(; i <= x ;i++){
            if(i - x/i > 0)
                break;
        }
        return i-1;
    }
};

