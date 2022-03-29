 class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        int t = 1;
        reverse(digits.begin(), digits.end());
        for(int i = 0; i<digits.size(); i++) {
            t += digits[i];
            digits[i] = t % 10;
            t /= 10;
        }
        if(t) digits.push_back(t);
        reverse(digits.begin(), digits.end());
        return digits;
    }
};

