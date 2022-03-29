 class Solution {
public:
    int XXX(string s) {
        int res = 0;
        vector<int> vec;
        bool sig = true;
        int i=0;//去除前导空格

        while(i<s.size())
        {
            if(s[i]==' ')
                i++;
            else
            break;
        }
        if(s[i]=='-')//判断符号
        {
            sig = false;
            i++;
        }
        else if(s[i]=='+')
        {
            sig = true;
            i++;
        }
        while(i<s.size())
        {
            if(s[i]<'0'||s[i]>'9')
            {
                break;
            }
            else
                vec.push_back(s[i]-'0');
            i++;
        }
        if(sig)
            for(int j=0;j<vec.size();j++)
            {
                if(res>(INT_MAX-vec[j])/10)
                    return INT_MAX;
                else
                    res = res*10+vec[j];
            }
        else
            for(int j=0;j<vec.size();j++)
            {
                if(res<(INT_MIN+vec[j])/10)
                    return INT_MIN;
                else
                    res = res*10-vec[j];
            }
        return res;
    }
};

