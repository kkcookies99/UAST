 class Solution {
public:
    int XXX(string s) {
        std::vector<bool> hit('z' + 1, false);
        int ret = 0;
        int tmp = 0;
        for(int i = 0; i < s.length(); ++ i) {
            if(hit[s[i]]) {
                ret = std::max(ret, tmp);
                i -= tmp; //指针回溯到上一次比对位置，for会自动后移
                tmp = 0;
                std::vector<bool>('z' + 1, false).swap(hit);
                continue;
            } 
            ++ tmp;
            hit[s[i]] = true;
        }
        if(tmp > 0) {
            ret = std::max(ret, tmp);
        }
        return ret;
    }
};

