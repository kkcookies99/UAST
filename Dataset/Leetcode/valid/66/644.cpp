class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        digits[digits.size() - 1] = digits[digits.size() - 1] + 1;
        bool FLAG = false; //记录是否进位；
        for (int i = digits.size() - 1; i > 0; i--)
        {
            if (digits[i] >= 10)
            {
                digits[i] = digits[i] - 10;
                digits[i - 1] = digits[i - 1] + 1;
            }
        }
        if (digits[0] >= 10)
        {
            digits[0] = digits[0] - 10;
            FLAG = true;
        }
        
        vector<int> outcome;
        if (FLAG) outcome.push_back(1);
        for (int j = 0; j < digits.size(); j++) outcome.push_back(digits[j]);

        return outcome;
    }
};

