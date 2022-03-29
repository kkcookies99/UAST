 class Solution {
public:
    int XXX(string s) {
        map<char,int> m;//map<character,index>
        int maxLen = 0;
        int start = 0;
        for(int i=0;i<s.size();i++){
            if(m.count(s[i])>0){
                start = max(start,m[s[i]]+1); //加max的原因：start只能往前走，不能往后退。
            }
            maxLen = max(maxLen,i-start+1);//本题求最大，故加max。
            m[s[i]] = i; //无论是否重复，都更新字符对应的下标为：当前字符串最新出现该字符的下标。
        }
        return maxLen;
    }
};

