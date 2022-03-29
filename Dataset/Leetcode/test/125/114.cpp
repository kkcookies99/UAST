 class Solution {
public:
    bool XXX(string s) {
        if (!s.size()) return true;
        string str = s;
        transform(str.begin(), str.end(), str.begin(), ::tolower);
        string::iterator i = str.begin();
        string::iterator j = str.end() - 1;
        while(i < j){
            while(!isalnum(*i)) i++;
            while(!isalnum(*j)) j--;
            if(*i != *j) break;
            i++;j--;
        }
        if(i >= j) return true;
        else return false;
    }
};

