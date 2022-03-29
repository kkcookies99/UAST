 class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        int len=digits.size();
        add(digits,len);
        return digits;
       
    }
    void add(vector<int>&digits,int len)
    {
         if(0<=digits[len-1]&&digits[len-1]<=8)
        {
            digits[len-1]=digits[len-1]+1;
            return;
        }
        else
        {
            digits[len-1]=0;
            if(len==1)//处理遇到9，99，999的情况
            {
                digits[0]=1;
                digits.push_back(0);
                return;
            }
            add(digits,len-1);
        }
    }
};

