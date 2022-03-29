 class Solution {
public:
    int XXX(string s) {
        //找最后一个单词的末尾标记
        int y = s.size()-1;
        while(y >= 0 && s[y] == ' ' )
            y--;
        //找最后一个单词的开头标记
        int x = y;
        while(x >= 0 && s[x] !=' ')
            x--;
        //下标相减产生长度
        return y-x;
    }
};

