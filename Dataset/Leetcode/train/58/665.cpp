 class Solution {
public:
    int XXX(string s) {
        s.erase(s.find_last_not_of(' ') + 1, s.size());//先去掉末尾所有空格，就简单了
        int pos = s.rfind(' ');
        if(pos != string::npos)
        {
            return s.size() - pos - 1;
        }
        else
        {
            return s.size();
        }
    }
};

