 class Solution {
public:
    string XXX(int n) {
        string res = "1";
        for (int i=1; i<n; i++)
        {
            int count = 1;
            string tmp;
            for (int j = 1; j < res.size(); j++)
            {
                if (res[j] == res[j-1])
                {
                    count++;
                    continue;
                }
                tmp += to_string(count) + res[j-1];
                count = 1;
            }
            tmp += to_string(count) + res.back();
            res = tmp;
        }
        return res;
    }
};

