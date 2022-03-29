 class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        int n = digits.size();
        int c = 1;
        for(int i = n - 1; i >= 0; i--){
            if(c == 0) {
                return digits;
            }
            int b = digits[i] + c;
            c = b / 10;
            digits[i] = b % 10;
        }
        if(c != 0){
            digits.insert(digits.begin(), c);
        }
        return digits;
    }
};

