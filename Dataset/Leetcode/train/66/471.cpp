class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        int d = 1; //进位
        for(int i = digits.size()-1; i >= 0 && d; i--){
            int m = digits[i] + d;
            digits[i] = m%10;
            d = m/10;
        }
        if(d){
            digits.insert(digits.begin(), 1);
        }
        return digits;
    }
};

