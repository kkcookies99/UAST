class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        int carry = 1;
        for(int i=digits.size()-1;i>=0;i--){
            int sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;
        }
        if(carry==1){
            digits.push_back(0);
            for(int i=digits.size()-1;i>=1;i--)
                digits[i] = digits[i-1];
            digits[0] = 1;
        }
        return digits;
    }
};

