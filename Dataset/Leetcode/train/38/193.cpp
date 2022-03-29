class Solution {
public:
    
    string XXX(int n) {
        if(n==1)return "1";
        if(n==2)return "11";
        string pre = XXX(n-1);
        int i = 0;
        int count = 1;
        string res;
        while(i<pre.size())
        {
            if(pre[i]==pre[i+1])
            {
                count++;
                i++;
            }
            else
            {
                res += to_string(count);
                res += pre[i++];
                count = 1;
            }
        }
        return res;
        

    }
};

