 class Solution {
public:
    string XXX(vector<string>& strs) {
        if(strs.size() == 0) return "";
        int times = strs[0].size();//每个字符串的扫描次数，扫描完毕及终止循环
        for(string s : strs)
            times = times > s.size() ? s.size() : times;
        if(times == 0) return "";

        string ans = "";
        for(int i = 0; i < times; i++){
            char tmp = strs[0][i];
            for(string s : strs){
                if(s[i] != tmp) return ans;
            }
            ans += tmp;
        }
        return ans;
    }
};

