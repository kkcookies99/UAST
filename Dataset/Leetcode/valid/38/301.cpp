class Solution {
public:
    string XXX(int n) {
        if(n==1)
            return "1";
        if(n==2)
            return "11";
        int i=0,count=1;
        string s1{"11"},s2;
        for(i=3;i<=n;++i)
        {
            for(size_t j = 0;j<s1.size();++j)
            {
                if(s1[j]==s1[j+1])
                {
                    ++count;
                }
                else
                {
                    string s = to_string(count);
                    s2.append(s);
                    s2.insert(s2.size(),1,s1[j]);
                    count=1;
                }
                 
            }   
            s1=s2;
            s2.clear();
        }
        return s1;
    }
};

