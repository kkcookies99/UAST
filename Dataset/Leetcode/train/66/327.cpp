 class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        int i = digits.size() - 1;
        vector<int> ret;
        int carry = 1;
        int c;
        while(i >= 0){
            c = digits[i] + carry;
            ret.push_back(c % 10);
            carry = c / 10;
            i--;
        }
        if(carry > 0)ret.push_back(carry % 10);

        reverse(ret.begin(),ret.end());
        return ret;
    }
};

