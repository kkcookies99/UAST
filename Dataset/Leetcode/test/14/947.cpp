 class Solution {
public:
    string XXX(vector<string>& strs) {
        string prefix = "";
        if (strs.empty()) return prefix;
        prefix = strs[0];
        for (auto str : strs)
        {
            if (str.length() == 0) return "";
            prefix = XXX(str, prefix);
            if (!prefix.size()) return "";
        }
        return prefix;
    }

    string XXX(string str1, string str2)
    {        
        int index = 0;
        while (index < min(str1.length(), str2.length()) &&
            str1[index] == str2[index])
        {
            index++;
        }
        return str1.substr(0, index--);
    }
};

