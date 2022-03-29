 class Solution {
public:
    string XXX(vector<string>& strs) {
        if (strs.empty()) return "";

        /*以第一个为元素为基准*/
        for (int i= 0; i < strs[0].length(); ++ i)
            /*和后面元素的做比较*/
            for (int j = 1; j < strs.size(); ++ j)
                /*第i个字符不一致，截断*/
                if (strs[0][i] != strs[j][i])
                    return strs[0].substr(0, i);

        return strs[0];
    }
};

