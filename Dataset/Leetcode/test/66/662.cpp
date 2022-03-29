class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        int size=digits.size()-1;
        digits[size]+=1;

        while(size!=-1)
        {
            if(digits[size]>9)
                if(size==0)         //特殊情况9999
                {
                    digits[size]=1;
                    digits.push_back(0);
                    break;
                }
                else
                {
                    digits[size]=0;
                    digits[size-1]+=1;
                    size--;
                }
            else break;
        }
        return digits;
    }
};

