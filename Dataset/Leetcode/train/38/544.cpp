 class Solution {
public:
    string XXX(int n) {
        string ret, tmp;
        if(n < 1) return ret;
        
        ret = "1";
        if(n == 1) return ret;
        while(n>1)
        {
            for(int i = 0; i <ret.size(); i++)
            {
                if(i == ret.size()-1)
                {
                    tmp.push_back('1');
                    tmp.push_back(ret[i]);
                }
                for(int j = i+1; j<ret.size(); j++)
                {
                    if(ret[i] != ret[j])
                    {
                        int tmpi = j-i;
                        char a = tmpi + 48;
                        tmp.push_back(a);
                        tmp.push_back(ret[i]);
                        i = j-1;
                        break;
                    }
                    if(j == ret.size()-1)
                    {
                        int tmpi = j-i+1;
                        char a = tmpi + 48;
                        tmp.push_back(a);
                        tmp.push_back(ret[i]);
                        i = j;
                        break;
                    }
                }
            }
            ret = tmp;
            tmp.clear();
            n--;
        }
        return ret;

    }
};

