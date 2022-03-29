 class Solution {
public:
    bool XXX(int x) {
        int y=x;
        int rev=0;
        while (x!=0&&x>0&&rev<INT_MAX/10) {
            int digit = x % 10;
            x = x/10;
            rev = rev*10+digit;
        }
        if (y==rev){
            return true;
        }
    return false;
    }
};

