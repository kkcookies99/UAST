 class Solution {
public:
    bool XXX(string s) {
        while(s.size() > 0) {
            auto front = s.front();
            auto back = s.back();
            if(isalnum(front) && isalnum(back)) {
                front = tolower(front);
                back = tolower(back);
                if(front != back) {
                    return false;
                }
                s.erase(s.begin());
                if(s.size()) {
                    s.pop_back();
                }
            } else if(isalnum(front) == false) {
                s.erase(s.begin());
                continue;
            } else if(isalnum(back) == false) {
                s.pop_back();
                continue;
            }
        }
        return true;
    }
};

