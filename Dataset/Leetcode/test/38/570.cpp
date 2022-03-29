 class Solution {
public:
    string XXX(int n) {
        string val="1";
        for(int i=0;i<n-1;i++) val=help(val);
        return val;
    }
    string help(string val)
    {
        string result;
        int count=0;
        for(int i=0;i<val.size();i++)
        {
            count++;
            if(i==val.size()-1||val[i+1]!=val[i])
            {
                result+=count+'0';
                result+=val[i];
                count=0;
            }
        }
        return result;
    }
};

