 class Solution {
public:
    int XXX(string s) {
        int maxlen = 0;
        int left = 0;//最左有效位置
        int last[255];//记录每个字母上一次出现的位置
        memset(last,-1,sizeof(last));
        for(int i = 0;i < s.size();i ++) {
            if(last[s[i]] >= left) left = last[s[i]] + 1;
            last[s[i]] = i;
            maxlen = max(maxlen,i - left + 1);
        }
        return maxlen;
    }
};

class Solution {
public:
    int XXX(string s) {//超级慢
        int maxlen = 0;
        map<char,int> m;
        int len = 0;
        for(int i = 0;i < s.size();i ++) {
            if(m.count(s[i]) == 0) {
                len ++;
                m[s[i]] = i;
            }
            else {
                len = 0;
                i = m[s[i]];//此句结合i++使得下一次计数从“头循环字母”的下一个开始数起
                m.clear();//头循环字母是指当出现重复时，下标较小的一个。
            }
            if(maxlen < len) maxlen = len;
        }
        return maxlen;
    }
};

