 class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        bool carry=true;
        int n=digits.size();
        vector<int> res;

        for(int i=n-1;i>=0;i--)
        {
            if(digits[i]==9&&carry)
            res.push_back(0);
            else if(!carry)
            res.push_back(digits[i]);
            else
            {
                carry=false;
                res.push_back(digits[i]+1);
            }
        }
        if(carry)
        res.push_back(1);
        
        reverse(res.begin(),res.end());
        return res;

    }
};

