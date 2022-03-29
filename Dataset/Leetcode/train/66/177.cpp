 class Solution {
public:
    vector<int> XXX(vector<int>& digits) {

        int n = digits.size();
        digits[n - 1] += 1;
        int c = 0;
        for(int i = n - 1; i >= 0; i --)
        {
            int c1 = (digits[i] + c) / 10;
            digits[i] = (digits[i] + c) % 10;
            c = c1;
        }
        if(c != 0)
        {
            digits.insert(digits.begin(), 1);
        }
        return digits;
    }
};

