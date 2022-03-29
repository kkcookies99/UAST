 class Solution {
public:
    int XXX(string s) {
        int count = 0;
        for (int i=s.size()-1; i>=0; i--){
            if (count == 0 && s[i] == ' ') continue;
            if (count != 0 && s[i] == ' ') return count;
            count++;
        }
        return count;
    }
};

