 class Solution {
public:
    int XXX(string s) {
        int index = s.size() - 1;
        while(s[index--] == ' '){
            s.pop_back();
        }
        int loc = s.find_last_of(' ', s.size() - 1);    
        return s.size() - 1 - loc; 
    }
};

