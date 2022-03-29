 class Solution {
public:
    string XXX(string a, string b) {
        int len_a = a.size();
        int len_b = b.size();
        string output;
        if(len_a > len_b){
            for(int i = 0; i < len_a - len_b; ++i){
                b = '0' + b;
            }
        }else{
            for(int i = 0; i < len_b - len_a; ++i){
                a = '0' + a;
            }
            len_a = len_b;
        }
        bool carry = 0;
        for(int i = len_a - 1; i >= 0; --i){
            bool ai = a[i] - '0';
            bool bi = b[i] - '0';
            bool bit = ai ^ bi ^ carry;
            carry = (ai & bi) | (ai ^ bi) & carry; 
            output.push_back(bit + '0');
        }
        if(carry) output.push_back('1');
        reverse(output.begin(), output.end());
        return output;
    }
};

