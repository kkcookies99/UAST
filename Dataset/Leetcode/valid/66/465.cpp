class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        int i;
        for(i=digits.size()-1;i>=0;i--)
        {
            digits[i]=(digits[i]+1)%10;
            if(digits[i]!=0)
                break;
        }
        if(i==-1)
        {
            vector<int>res(digits.size()+1);
            res[0]=1;
            return res;
        }
        return digits;
    }
};

