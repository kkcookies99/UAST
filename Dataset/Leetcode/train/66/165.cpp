 class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        if(digits.back() < 9)
        {
            digits.back()++;
        }
        else
        {
            digits.back() = 0;
            int i = digits.size() - 2;
            for(; i >= 0; i--)
            {
                if(digits[i] == 9)
                {
                    digits[i] = 0;
                }
                else
                {
                    digits[i]++;
                    break;
                }
            }
            if(i < 0)
            {
                digits.insert(digits.begin(), 1);
            }

        }
        return digits;
    }
};

