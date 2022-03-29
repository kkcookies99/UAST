 class Solution {
public:
    //第一反应就是转换成int类型然后加完再转回去，结果这是个大数啊，我都改成long了还是没办法表示
    //好吧字符串二进制的加法，那就用二进制加法来加吧
    string XXX(string a, string b) {
        string s = "";
        int flag = false;
        string::reverse_iterator r_iter = a.rbegin(), r_iter1 = b.rbegin();
        while((r_iter != a.rend()) && (r_iter1 != b.rend())){
            int temp = *r_iter + *r_iter1 + flag - '0' - '0';
            if(temp > 1)    flag = true;
            else            flag = false;
            s += char(temp % 2 + '0');
            r_iter++;
            r_iter1++;
        }
        while(r_iter != a.rend()){
            int temp = *r_iter + flag - '0';
            if(temp > 1)    flag = true;
            else            flag = false;
            s += char(temp % 2 + '0');
            r_iter++;
        }
        while(r_iter1 != b.rend()){
            int temp = *r_iter1 + flag - '0';
            if(temp > 1)    flag = true;
            else            flag = false;
            s += char(temp % 2 + '0');
            r_iter1++;
        }
        if(flag) s += '1';
        reverse(s.rbegin(),s.rend());
        return s;
    }
};

