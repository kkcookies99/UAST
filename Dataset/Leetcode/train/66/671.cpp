class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        int n=digits.size()-1;
        int m;
        for(m=1;m;n--)
        {
            if(n==-1)
            {
                digits.insert(digits.begin(),1);
                break;
            }
            digits[n]=digits[n]+m;
            m=0;
            if(digits[n]==10)
            {
                digits[n]=0;
                m=1;
            }

        }
        return digits;
    }
};

