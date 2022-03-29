class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        vector<int> res;
        int tem=digits[digits.size()-1]+1;
        while(!digits.empty())
        {
            if(tem>9)
            {
            res.push_back(0);
            digits.pop_back();
            if(digits.empty()) res.push_back(1);
            else tem=digits[digits.size()-1]+1;
            }
            else {
                res.push_back(tem);
                digits.pop_back();
                if(!digits.empty())
                tem=digits[digits.size()-1];
                }
            
        }
        reverse(res.begin(),res.end());
        return res;

    }
};
code block

