 class Solution {
public:
    // 在每个'V'内(不包括右上角元素)，元素间隔2 * numRows - 2
    string XXX(string s, int numRows) {
        if(numRows == 1) return s;
        string res;
        int delta = 2 * numRows - 2;
        // 逐行处理
        for(int i = 0; i < numRows; ++i) {
            // 逐'V'处理
            int j = 0;// 第j个'V'
            for(int index = i + j * delta; index < s.size(); index += delta){
                if(i == 0 || i == numRows - 1)
                    res += s[index];
                else{
                    res += s[index];
                    if(index + 2 * numRows - 2 * (i + 1) < s.size())
                        res += s[index + 2 * numRows - 2 * (i + 1)];
                }
            }
        }
        return res;
    }
};

