 class Solution {
public:
    int XXX(string s) {
        int size = s.size();
        if(size==0) return 0;
        int res = 0;
        int index = size - 1;
        while(index>=0 && s[index] == ' ') index--;
        while(index>=0 && s[index] != ' '){
            res ++;
            index--;
        }
        return res;
    }
};

