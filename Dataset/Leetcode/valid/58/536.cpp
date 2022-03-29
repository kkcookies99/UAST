class Solution {
public:
    int XXX(string s) {
        if(s.size() == 0)
            return 0;

        auto it = s.end() -1;
        int count = 0;
        
        while(*it == ' '){
            it--;
        }

        for(; *it !=' ' && it != s.begin() - 1; it--){
            count++;
        }

        return count;
    }
};

