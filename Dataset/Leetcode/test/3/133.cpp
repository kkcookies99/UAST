 class Solution {
public:
    int XXX(string s) 
    {
        if (s.empty())
            return 0;
        map<char, int> m;
        int longest = 0;//无重复字符子串最长长度
        int len = 0;//无重复字符子串长度
        //将s这个字符串一个个放入map容器m
        for (int i = 0; i < s.length(); i++)
        {
            //查，当前存入字符是否存在
            auto it = m.find(s[i]);
            if (it != m.end())//假如找到，说明有重复
            {
                len = i - it->second;//因为重复，所以在当前值之前的子串是一个局部最长
                longest = max(longest, len);//所有局部最长的比较，最长的记录下来
                m.erase(m.begin(), ++it);//删掉重复字符及其左边的字符，因接下来的比较需从重复这个的下一位开始
                //erase区间是前闭后开，使用m.erase(m.begin(), it)将不会删掉it这一位
            }
            m.insert(pair<char, int> (s[i], i));
        }
        return longest;
    }
};

