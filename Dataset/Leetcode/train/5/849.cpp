 class Solution {
public:
    string XXX(string str) { /* 中心扩展法 */
        int len = str.length(),length;
        int max = 0, index, num;
        for(int i=0; i<len; i++){
            /* 1.处理一个字符为中心扩展
                index---|
                        |
                str = ababa
             */
            num = 0;
            while(str[i-num]==str[i+num]){
                num++;
                /* 判断是否越界 */
                if(i-num<0 || i+num>=len) {
                    break;
                }
            }
            /* 计算当前最大回文子串长度 */
            if (num * 2 - 1 > max) {
                max = num * 2 - 1;
                index = i;
            }
            /* 2.处理两个字符为中心扩展, index指向两个中的前一个
                index---||
                        ||
                str = abaaba
             */
            num = 0;
            if (i - num >= 0 && i + 1 + num < len){
                if (str[i - num] != str[i + 1 - num]) {
                    continue;
                }else{
                    num++;  //equal
                }
                /* 判断是否越界 */
                if(i-num<0 || i+1+num>=len) {
                    /* 计算当前最大回文子串长度 */
                    if (num * 2 > max) {
                        max = num * 2;
                        index = i;
                    }
                    continue;
                }
                while(str[i - num] == str[i + 1 + num]){
                    num += 1;
                    /* 判断是否越界 */
                    if(i-num<0 || i+1+num>=len) {
                        break;
                    }
                }
                /* 计算当前最大回文子串长度 */
                if (num * 2 > max) {
                    max = num * 2;
                    index = i;
                }
            }
        }
        int start, end;
        start = max % 2 == 0 ? index - (max / 2 - 1) : index - max / 2;
        string temp = str.substr(start, max);
        return temp;
    }
};

