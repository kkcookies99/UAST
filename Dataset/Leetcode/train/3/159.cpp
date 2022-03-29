 class Solution {
public:
//我的做法和答案的不同，我用哈系表统计字符上一次出现的位置。另外用一个left指针表明目前窗口的左端。
//如果还没有出现，就加入到哈希表中，增加长度
//如果出现过了，但是出现在了当前窗口的左边（不在窗口内），那就更新哈系表，增加长度
//如果出现过了，但是出现在了当前窗口内，那就修改长度，并且把窗口左端移到下一个位置，更新哈希表。
    int XXX(string s) 
    {
        unordered_map<char,int> hash;
        int length=0;
        int max_length=0;
        int left=0;
        for(int i=0;i<s.size();i++)
        {
            if(hash.find(s[i])==hash.end())
            {
                length++;
                hash[s[i]]=i;
                max_length=max(max_length,length);
            }
            else
            {
                if(hash[s[i]]<left)
                {
                    length++;
                    hash[s[i]]=i;
                    max_length=max(max_length,length);
                }
                else
                {
                    length=i-hash[s[i]];
                    left=hash[s[i]]+1;
                    hash[s[i]]=i;
                    max_length=max(max_length,length);
                }
            }
        }
        return max_length;
    }
};

