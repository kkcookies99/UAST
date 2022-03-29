 class Solution {
public:
    string XXX(string s, int numRows) {
        int s_len = s.length();
        // 特数判断
        if (numRows == 1 || s_len <= numRows) {
            return s;
        }
        int dis = 2*(numRows-1);
        string ans = "";
        for (int i = 0; i < numRows; ++i) {
            vector<int> jump;
            jump.push_back(dis-2*i);   // 6
            jump.push_back(2*i); // 0
            ans += s[i];
            if (!jump[0] && !jump[1])  break;
            for (int r = 0, j = i+jump[r]; j < s_len; r = (r+1)%2, j += jump[r]) {
                // 首末两行特殊控制
                if (!jump[r] && (i == 0 || i == numRows-1)) {
                    // 加上的都是非零数
                    j = j + ((jump[0] != 0) ? jump[0] : jump[1]);
                    if (j >= s_len)  continue;
                }
                ans += s[j];
            }
        }
        return ans;
    }
};

