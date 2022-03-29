class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
            int i = digits.size() - 1;
            digits[i] = digits[i] + 1;

            for(; i > 0; i--){
                if(digits[i] == 10){
                    digits[i] = 0;
                    digits[i - 1] += 1;
                } 
            }

            if(digits[0] == 10){
                digits[0] = 1;
                digits.push_back(0);
            }

            return digits;
        }
};

