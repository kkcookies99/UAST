class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        int len = int(digits.size());
        vector<int> tmp(digits.begin(), digits.end());
        int last = tmp[len-1];
        tmp[len-1] = last+1;

        for (int i = 0; i < len; ++i) {
            if (i == len - 1 && tmp[0] > 9) {
                tmp[0] = 0;
                tmp.insert(tmp.begin(), 1);
            } else if (tmp[len-i-1] > 9) {
                tmp[len-i-1] = 0;
                tmp[len-i-2] += 1;
            } else {
                break;
            }
        }
        return tmp;
    }
};
` ``
