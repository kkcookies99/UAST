class Solution {
public:
    int XXX(int x) {
        long long xLast=x;
        long long xNext;
        while(xLast*xLast>x){
            xNext=(x+xLast*xLast)/(2*xLast);
            xLast=xNext;
        }
        return xLast;
    }
};

