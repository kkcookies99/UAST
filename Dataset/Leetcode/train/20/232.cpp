 class Solution {
public:
    bool XXX(string s) {
        string result = "";
        int str_size = s.size();
        for (int i = 0; i < str_size; ++i)
        {
            int cur_size = result.size();
            char cur_chr = s[i];
            if (cur_size == 0 && (s[i] == ')' || s[i] == '}' || s[i] == ']'))
                return false;
            
            int diff = s[i] - result[cur_size > 0 ? cur_size - 1 : 0];
            if (diff == 1 || diff == 2)
                result.pop_back();
            else
                result += s[i];
        }
        
        return result[0] == 0;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

