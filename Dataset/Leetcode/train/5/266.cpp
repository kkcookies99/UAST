 class Solution {
public:
    string XXX(string s) {
        //insert '#'
        string t = "$#";
        for(int i = 0;i < s.size();i++)
        {
            t += s[i];
            t += "#";
        }
        //calculate p[]
        //开vector<int>就会超时
        //vector<int> p(t.size(), 0);
        int p[t.size()] = {0};
        int mx = 0;
        int id = 0;
        int resLen = 0;
        int resCenter = 0;
        for(int i = 1; i < t.size(); i++)
        {
            p[i] = mx>i?min(p[2 * id - i],mx - i):1;
            while(t[i + p[i]] == t[i - p[i]])
                p[i]++;
            if(mx < p[i]+i)
            {
                mx = i + p[i];
                id = i;
            }
            if(resLen < p[i])
            {
                resLen = p[i];
                resCenter = i;
            }
        }
        return s.substr((resCenter - resLen)/2 , resLen - 1);
    }
};

