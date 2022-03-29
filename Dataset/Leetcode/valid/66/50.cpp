 class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        int size=digits.size();
        digits[size-1]+=1;
        for(int i=size-1;i>0;i--)
        {
            if(digits[i]==10)
            {
                digits[i-1]=digits[i-1]+1;
                digits[i]=0;
            }
        }
        if(digits[0]==10)
        {
            digits[0]=1;
            for(int i=1;i<size;i++)
            {
                digits[i]=0;
            }
            digits.push_back(0);
        }
        return digits;
    }
};

