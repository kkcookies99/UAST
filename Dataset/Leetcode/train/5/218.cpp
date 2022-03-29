 class Solution {
public:
    string XXX(string s) { 
        string ans;
        string::iterator iter, p, q;

        //获取当前中心下的最长回文，之后跟ans做比较
        function<void(string::iterator, string::iterator)> lamd_func = [&ans, &s](string::iterator begin, string::iterator end)
        {
            while(begin != s.begin() - 1 && end != s.end() && *begin == *end)
                begin--, end++;
            begin++;
            if(end - begin > ans.size())
                ans = s.substr(begin - s.begin(), end - begin);
        };
        
        for(iter = s.begin(); iter != s.end(); ++iter)
        {
            //以字母之前的位置为中心
            lamd_func(iter - 1, iter);

            //以字母本身为中心
            lamd_func(iter - 1, iter + 1);
        }
        
        return ans;
    }
};

