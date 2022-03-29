 class Solution {
public:
    int XXX(string s) {
        unordered_map<int,int> hash;/无序表时间复杂度低
        int maxlen = 0;
        int left = 0;    //左边界
        for(int i = 0;i < s.size();i++)
        {
            if(hash.count(s[i]) != 0 && hash[s[i]]>= left)   
            {
                left = hash[s[i]];
            }
            else  
            {
                maxlen  = max(maxlen,i - left + 1);
            }
            hash[s[i]] = i+1;
        }
        return maxlen;
    }
};

