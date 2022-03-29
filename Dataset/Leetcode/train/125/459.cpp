 class Solution {
public:
    bool XXX(string s) {

        for (int i = 0, j = s.length() - 1; i < j; i++, j--){
            /*
            1. C 库函数 void isalnum(int c) 检查所传的字符是否是字母和数字。
                return: 如果 c 是一个数字或一个字母，则该函数返回非零值，否则返回 0。

            2. C 库函数 int tolower(int c) 把给定的字母转换为小写字母。
                return: 如果 c 有相对应的小写字母，则该函数返回 c 的小写字母，否则 c 保持不变。
            */
            
            //use (&& i < j) to prevent overflow. For example: ".,"
            while(!isalnum(s[i]) && i < j){
                i++;
            }

            while(!isalnum(s[j]) && i < j){
                j--;
            }

            if(tolower(s[i]) != tolower(s[j])){
                return false;
            }
        }

        return true;

    }
};

