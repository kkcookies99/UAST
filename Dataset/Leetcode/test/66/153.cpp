 class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        reverse(digits.begin(), digits.end());
        int cryBit = 1;
        int sumVal;
        for(int i = 0; i < digits.size(); i++){
            sumVal = digits[i] + cryBit;
            digits[i] = sumVal % 10;
            cryBit = sumVal / 10;
            if(cryBit == 0) break;
        }
        if(cryBit == 1) digits.push_back(1);
        reverse(digits.begin(), digits.end());
        return digits;
    }
};

