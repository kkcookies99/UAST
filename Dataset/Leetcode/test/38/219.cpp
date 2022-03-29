class Solution {
public:
    string XXX(int n) {
        if(n == 1) return "1";
        string last = XXX(n-1); //"21"
        string res;
        char now = last[0]; //'2'
        int count = 0; //
        for(int i = 0;i < last.size();i++)
        {
            if(last[i] == now) count++;
            else{ //找到一个不同字符
                if(count > 0)
                {
                    res+= to_string(count);
                    res.push_back(now);
                }
                now = last[i];
                count = 1; 
            }
        }
        if(count > 0)
        {
            res+=to_string(count);
            res.push_back(now);
        }
        return res;
    }
};

