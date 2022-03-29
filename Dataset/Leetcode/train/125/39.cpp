 class Solution {
public:
    bool XXX(string s) {
        int i = 0;int j = s.size() - 1;
        while (i < j){
            while (! isalnum(s[i]) && i < j){i++;}
            while (! isalnum(s[j]) && i < j){j--;}
            if( tolower(s[i]) == tolower(s[j])){i++;j--;continue;}
            return false;
        }
        return true;
    }
};

