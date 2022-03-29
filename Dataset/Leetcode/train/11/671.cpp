 class Solution {
public:
    int XXX(vector<int>& height) {
        int size = height.size();
        if (size < 2) return 0;
        int XXX = 0, l = 0, r = size - 1;
        while(l < r) {
            int lVal = height.at(l);
            int rVal = height.at(r);
            int temp = ((lVal < rVal) ? lVal : rVal) * (r - l);
            XXX = (temp < XXX) ? XXX : temp;
            if (lVal < rVal) {
                int tempLVal = 0;
                do {
                    if ((++l) < r)
                        tempLVal = height.at(l);
                    else break;
                } while (tempLVal <= lVal);
            } else {
                int tempRVal = 0;
                do {
                    if (l < (--r))
                        tempRVal = height.at(r);
                    else break;
                } while (tempRVal <= rVal);
            }
        }
        return XXX;
    }
};

