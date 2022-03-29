class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        for(int n = digits.size()-1;n>=0;--n)
        {           
            if(digits[n] = (digits[n]==9)?0:++digits[n]) 
            {
                return digits;
            }
        }
        digits.insert(digits.begin(),1);
        return digits;
    }
};

