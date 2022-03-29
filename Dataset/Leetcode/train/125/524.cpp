 class Solution {
public:
    bool XXX(string s) {
        if (s == "") return true;

        string str = "";
        for (int i = 0; i < s.size(); i++){
            if (isdigit(s[i])) str += s[i];
            if (isalpha(s[i])) str += tolower(s[i]);
        }

        for (int i = 0, j = str.size() -1; i <= j; i++, j--){
            if (str[i] != str[j]) return false;
        }

        return true;

    }
};

