 class Solution {
public:
    string XXX(string s) {
        int len = s.length();
        vector<vector<int>> flag(len,vector<int>(len));//二维数组
        int max = 0;
        int max_1 = 0, max_2 = 0;//最大回文字串下标
        for (int i = 0; i < len; i++) {
            flag[0][i] = 0;
        }
        for (int i = len-1; i >=0; i--) {    
            for (int j = i; j <= len-1; j++) {
                if (i == j) {//一个字母
                    flag[i][j] = 1;
                    if (flag[i][j] > max) {
                        max = flag[i][j];
                        max_1 = i;
                        max_2 = j;
                    }
                }
                else if (s[i] == s[j]) {//两边相同
                    if (j - i == 1) {//bb类型
                        flag[i][j] = 2;
                        if (flag[i][j] > max) {
                            max = flag[i][j];
                            max_1 = i;
                            max_2 = j;
                        }
                    }
                    else if (flag[i + 1][j - 1] != 0) {//abxba，axa
                        flag[i][j] = flag[i + 1][j - 1] + 2;
                        if (flag[i][j] > max) {
                            max = flag[i][j];
                            max_1 = i;
                            max_2 = j;
                        }
                    }
                    else if (flag[i + 1][j - 1] == 0) {//asdfa
                        flag[i][j] = 0;
                    }
                }
                else if(s[i]!=s[j]){//两边不同
                    flag[i][j] = 0;
                }
                    
            }

           
            
        }
        return s.substr(max_1, max_2-max_1+1);
    }
};

