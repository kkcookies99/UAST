 class Solution {
public:
    int XXX(string s) {
        string s1; 
        auto ite = s.begin();
        int n = 0;
        for(; ite != s.end(); ite++)
        {
            char c = *(ite);
            if(s1.find(c) == -1)
                s1.push_back(c);
            else
                {
                    if(s1.find(c) == 0)
                        s1.erase(s1.begin());//如果是与第一个字符相同，删除第一个
                    else
                    {
                        s1.erase(0,s1.find(c)+1);//删除第0个字符后面n个字符，此处为0-s1.find(c),要加1
                    }
                    s1.push_back(c);
                }
            n = s1.size()>n ? s1.size() : n;
        } 

        return n;
    }

};

