class Solution {
public:
    int XXX(string s) {
        stringstream ss(s);
        ss>>s;
        int64_t ret = 0;
        auto it = s.begin();
        auto e = s.end();
        bool b = true;
        if(*it == '-')
        {
            b = false;
            ++it;
        }else if(*it == '+')
        {
            b = true;
            ++it;
        }
        while(it != e)
        {
            if(*it > '9' || *it < '0')break;
            int d = *it-'0';
            ret = ret*10+d;
            if(ret > INT_MAX)break;
            ++it;
        }
        if(!b)ret = -ret;
        if(ret > INT_MAX)return INT_MAX;
        if(ret < INT_MIN)return INT_MIN;
        return ret;
    }
};

