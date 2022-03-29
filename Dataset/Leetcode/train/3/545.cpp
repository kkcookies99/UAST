 class Solution {
public:
    int XXX(string s) {
        set<char> sa;
        int result = 1;
        int temp = 1;
        char first,last;
        if(s.length()==0)
            return 0;
        first = s[0];
        sa.insert(s[0]);
        int saved = -1;
        int start = 0;
        for(int i = 1;i<s.length();i++)
        {
            last = s[i];
            if(!sa.count(last))
            {
                sa.insert(last);
                result += 1;
            }
            else
            {
                if(result>temp)
                    temp = result;
                
                if(first==last)
                {
                    sa.clear();
                    sa.insert(last);
                    saved = i - 1;
                    start = i;
                    result = 1;
                }
                else
                {
                    for(int j = saved+1;j<s.length();j++)
                    {
                        if(s[j]==last)
                        {
                            saved = j;
                            break;
                        }
                    }
                    result = result-saved+start;
                    char del;
                    for(int j = start;j<saved;j++)
                    {
                        del = s[j];
                        sa.erase(del);
                    }
                    start = saved+1;
                }
            }
            first = last;
        }
        if(result>temp)
            return result;
        else
            return temp;
    }
};

