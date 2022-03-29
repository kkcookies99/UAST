 class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        if (digits.back() < 9){
            digits.back() += 1;
        }
        else{
            int i = digits.size() - 1;
            for (;i >= 0 && digits[i] == 9; i--){
                digits[i] = 0;
            }
            if (i >= 0)
                digits[i] += 1;
            else 
                digits.insert(digits.begin(), 1);
        }
        return digits;       
    }
};

