 class Solution {
public:
    bool XXX(string s) {
        int n = s.length();
        if(n == 0 || n%2)
        {
            return false;
        }
        if(getValue(s[0]) > 0)
        {
            return false;
        }
        vector<int> left;
        for(int i = 0; i < n ; i ++)
        {
            int tem = getValue(s[i]);

            if(tem < 0)
            {
                left.push_back(tem);
            }
            else
            {
                if(left.size() == 0)
                {
                    return false;
                }
                if(tem + left[left.size() - 1] == 0)
                {
                    left.pop_back();
                }
                else
                {
                    return false;
                }
            }
        }

        if(left.size() != 0)
        {
            return false;
        }
        return true;
    }

    int getValue(char sz)
    {
        switch(sz)
        {
            case '(':
                return -1;
            case ')':
                return 1;
            case '{':
                return -2;
            case '}':
                return 2;
            case '[':
                return -3;
            case ']':
                return 3;
            default:
                return 0;
        }
        return 0;
    }
};

