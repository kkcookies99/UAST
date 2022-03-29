class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        vector<int> res(digits.rbegin(), digits.rend());
        int len = digits.size();
        int left = 0, right = len - 1, up = 1;
        while (left <= right) {
            if (res[left] == 9 && up == 1) {
                res[left++] = 0;
            } else {
                res[left]++;
                up = 0;
                break;
            }
        }
        if (up == 1) {
            res.push_back(up);
        }
        reverse(res.begin(), res.end());

        return res;
    }
};

