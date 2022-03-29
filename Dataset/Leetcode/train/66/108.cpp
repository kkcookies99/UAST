 class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        int pos = -1;
        for(int i = (int)digits.size() - 1;i >= 0; i--){
            if(digits[i] != 9){
                pos = i;
                break;
            }
            else digits[i] = 0;
        }
        if (pos == -1){
            digits.insert(digits.begin(), 1);
        } else{
            digits[pos] = digits[pos] + 1;
        }
        return digits;
    }
};

