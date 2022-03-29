 class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        int jin = 1, n = digits.size();
        reverse(digits.begin(), digits.end());
        for(int &x : digits) {
            int t = x + jin;
            x = t % 10;
            jin = t / 10;
        }
        if(jin) digits.push_back(1);
        reverse(digits.begin(), digits.end());
        return digits;
    }
};

