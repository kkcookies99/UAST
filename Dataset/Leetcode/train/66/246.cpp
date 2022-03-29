 class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        vector<int> v;
        vector<int> ans;
        if(digits.size() == 1) if(digits[0] < 9) ans.push_back(digits[0] + 1); 
                                else {ans.push_back(1), ans.push_back(0);}
        else{
            for(int i = digits.size() - 1; i >= 0; --i){
                if(digits[i] == 9 && i == digits.size() - 1) {digits[i - 1] += 1; v.push_back(0);}
                else if(i == digits.size() - 1) v.push_back(digits[i] + 1);
                else if(digits[i] > 9 && i != 0) {v.push_back(0); digits[i - 1] += 1;}
                else if(digits[i] > 9 && i == 0) {v.push_back(0); v.push_back(1);}
                else v.push_back(digits[i]);
            }
            for(int i = v.size() - 1; i >= 0; --i){//按顺序存
                ans.push_back(v[i]);
            }
        }
        return ans;
    }
};

