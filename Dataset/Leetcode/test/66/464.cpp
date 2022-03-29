class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        int i = digits.size()-1;
        digits[i] += 1;
        while(i != -1 && digits[i] == 10) {
            digits[i] = 0;
            if(i - 1 != -1) {
                digits[i-1] += 1;
            } else {
                digits.insert(digits.begin(),1);
                
            }
            i--;
        }
        return digits;
    }
};

