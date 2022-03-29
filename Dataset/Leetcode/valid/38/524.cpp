 class Solution {
public:
    string XXX(int n) {
        if(n == 1) return "1";  //递归边界
        string str = XXX(n - 1);    //递归入口
        string res;
        for(int i = 0; i < str.size(); i++) {
            int j = i + 1;
            int same = 0;   //记录连续相同的字符数字个数
            while(str[i] == str[j] && j < str.size()) {
                same++;
                j++;
            }
            char r1 = same + 1 + '0';   //记录个数
            char r2 = str[i];           //记录当前数字
            res += r1;
            res += r2;
            i = j - 1;
        }   
        return res;
    }
};

