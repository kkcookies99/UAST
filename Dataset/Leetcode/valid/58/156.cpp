 class Solution {
public:
    int XXX(string s) {
        int length = 0;  
        bool flag = false;
        string::reverse_iterator iter = s.rbegin();
         while(iter != s.rend()) {
            if(*iter != ' ') {
                flag = true;
                ++length;
            } else if(*iter == ' ' && flag == true) {
                return length;
            }
            ++iter;
        }
        return length;
    }
};

