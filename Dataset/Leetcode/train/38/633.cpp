 class Solution {
public:
    string XXX(int n) {
        if(n == 1)
            return "1";
        string last = XXX(n-1), res;
        for(int i = 0, count = 1; i < last.size(); ++i)
        {
            if(last[i] != last[i+1])
            {
                res += to_string(count) + last[i];
                count = 1;
            }
            else ++count;
        }
        return res;
    }
};

