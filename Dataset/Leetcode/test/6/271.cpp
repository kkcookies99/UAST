 class Solution {
public:
    string XXX(string s, int numRows) {
        if (numRows <= 1) return s;
        string ret_ans;
        ret_ans.resize(s.length());
        int gap_num = numRows * 2, cnt = 0;
        int lun = numRows * 2 - 2;
        for (int i = 0; i < numRows; ++i) {
            gap_num -= 2;
            // printf("-----\n");
            // printf("%d %d\n", i, gap_num);
            if (gap_num == lun || gap_num == 0) { //边界
                for (size_t j = i; j < s.length(); j += lun) {
                    // printf("%d %d %c\n",j, cnt, s[j]);
                    ret_ans[cnt++] = s[j];
                }
            } else {
                int tmp = 0;
                for (size_t j = i; j < s.length();) {
                    ret_ans[cnt++] = s[j];
                    // printf("%d %d %c\n",j, cnt, s[j]);
                    if ((tmp & 1) == 0) {
                        j += gap_num;
                    } else {
                        j += lun - gap_num;
                    }
                    ++ tmp;
                }
            }
        }
        return ret_ans;
    }
};

