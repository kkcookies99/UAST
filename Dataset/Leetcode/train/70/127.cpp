class Solution {
public:
    int XXX(int n) {
        if (n == 1)return 1;
        else if(n == 2)return 2;
        int result;
        int x,y;
        x = 1; y = 2;
        for (int i = 3; i <= n; i++){
            result = x + y;
            x = y;
            y = result;
        }
        return result;
    }
};

