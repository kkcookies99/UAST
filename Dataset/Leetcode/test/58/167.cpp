 class Solution {
public:
    int XXX(string s) {
        if(s.empty()) return 0;
        int count = 0;
        for(int n = s.size() - 1; n >= 0; n--){
            if(s[n] == ' '){
                if(count == 0) continue; // 跳过最后面的空格
                else break;
            }
            else
                count++;
        }
        return count;
    }
};

