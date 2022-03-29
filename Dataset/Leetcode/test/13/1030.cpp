 class Solution {
public:
    //在s串中把字符串str1转化为str2，注意str1也可能不在s串中
    string str1ReplaceStr2(string s,string str1, string str2) {
        if (s.find(str1) < s.size()) {
            // 字符串s中有str1,则直接把str1（默认长度为2）转换为str2
            s.replace(s.find(str1),2,str2);
            return s;
        } else {
            // 如果字符串s中没有str1，则直接返回s
            return s;
        }
    }

    int XXX(string s) {
        //先把六种特殊情况对应的双字符替换为单字符，方便后续遍历
        //不管有没有，先换了再说
        s = str1ReplaceStr2(s,"CM","O");
        s = str1ReplaceStr2(s,"CD","P");
        s = str1ReplaceStr2(s,"XC","Q");
        s = str1ReplaceStr2(s,"XL","R");
        s = str1ReplaceStr2(s,"IX","S");
        s = str1ReplaceStr2(s,"IV","T");

        //定义两个数组，列出可能情况
        int values[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        char keys[] = {'M','O','D','P','C','Q','L','R','X','S','V','T','I'};
        
        //用于保存结果
        int ans = 0;

        //拿到s的长度
        int size = s.size();

        //遍历字符串s获取答案
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < 13; j++) {
                if (s[i] == keys[j]) {
                    ans += values[j];
                }
            }
        }

        return ans;

    }
};
    

