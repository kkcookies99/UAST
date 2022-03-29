 class Solution {
public:
    bool XXX(string s) {
        //先将字符串存起来，去除标点符号
        int n = s.size();
        vector<char> h;
        for(int i = 0; i < n; ++i)
        {
            if(isalpha(s[i]))
            {
                h.push_back(tolower(s[i]));
            }
            if(isdigit(s[i]))
                 h.push_back(tolower(s[i]));
        }
        int i = 0;
        int j = h.size() - 1;
        while(i < j)
        {
            if(h[i] != h[j])
                return false;
            i++;
            j--;
        }
        return true;
    }
};

