 class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        int carry = 1;

        for(int i=digits.size()-1;i>=0;i--){
            int result = digits[i]+carry;
            carry = result/10;
            digits[i] = result%10;
        }

        if(carry==1){
            digits.insert(digits.begin(), 1);
        }

        return digits;

    }
};