 class Solution {
public:
    int XXX(string s) {
        const int SIZE = s.size();
        int res = 0;

        bool isLastBlank = false;
        bool canAdd = true;
        if(s[SIZE - 1] == ' ')
            isLastBlank = true;
            canAdd = false;
        
        for(int i = SIZE - 1; i > -1; --i) {
            if(s[i] == ' ') {
                if(isLastBlank)
                    continue;
                else
                    break;
            }

            if(! canAdd){
                canAdd = true;
                isLastBlank = false;
            }

            res++;
        }

        return res;
    }
};

