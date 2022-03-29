 class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        int len = digits.size();
        int result = 1;
        digits[len-1] += 1;
        for (int i=len-1; i>0; i--){
            if(digits[i]==10){
                digits[i] = 0;
                digits[i-1] += 1;
            }
        }
        if(digits[0]==10){
            digits[0] = 0;
            digits.insert(digits.begin(), 1);
        }
        return digits;
    }
};

