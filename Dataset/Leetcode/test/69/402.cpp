class Solution {
public:
    int XXX(int x) {
        int result = 0;
        for(int i = 1;i<=x;i++) {
            if (x / i == i) {
                result = i;
                break;
            }
            else if(x / i < i){
                result = i - 1;
                break;  
            }
        }
        return result;
    }
};

