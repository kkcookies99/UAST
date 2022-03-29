class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        int c = 1; //进位标志位
        auto iter = digits.rbegin();
        for(; iter != digits.rend() && c; ++iter){
            if(*iter == 9)
                *iter = 0;
            else{
                ++(*iter);
                c = 0;
            }
        }
        if(iter == digits.rend() && c){
            digits.insert(digits.begin(), 1);
        }
        return digits;
    }
};

