 class Solution {
public:
    int XXX(string str) {
       
        int flag = 0;
        int head = 0;
        string result = "0";
        if (str == "") {
            return 0;
        }
    
        for (int i = 0; i < str.size(); i ++) {
            if (flag == 0 && str[i] == ' ') {
                //证明开头是空格
                continue;
            } else {
                flag = 1;
                if (head == 0) {
                    //确定第一个字符
                    if (str[i] == '-' || str[i] == '+') {
                        head = 1;
                        result = "";
                        result.append(1, str[i]);
                    } else if (str[i] > 57 || str[i] < 48) {
                        //证明开头不是数字
                        return 0;
                    } else {
                        result.append(1, str[i]);
                        head = 1;
                    }
                } else {
                    //head = 1了 开始往后进行判断
                    if (48 <= str[i] <=57) {
                        //证明是数字
                        result.append(1, str[i]);
                    } else if ( str[i] > 57 || str[i] < 48) {
                        break;
                    } else if (str[i] == ' ') {
                        continue;
                    }
                }
            }
        }
        int result_int;
        stringstream ss;
        ss<<result;
        ss>>result_int;
        return result_int;
    }
};

