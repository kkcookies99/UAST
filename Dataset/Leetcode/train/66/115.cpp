 class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        int jw = 1;                //进位
        for (int i = digits.size() - 1; i >= 0; -- i){
            int t = digits[i] + jw;
            digits[i] = t % 10;
            jw = t / 10;
        }
        if (jw) digits.insert(digits.begin(), 1);
        return digits;
    }
};

