class Solution {
public:
    int XXX(int n) {
        int f=0;
        int g=1;
        while(0<n--){
            g=g+f;
            f=g-f;
        }
        return g;
    }
};

