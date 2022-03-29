class Solution {
public:
    string XXX(int n) {
        if(n == 1){
            return "1";
        }

        string str = XXX(n - 1);

        // 获取str里面的个数；
        string res = "";
        int count = 1;
        char pre = str[0];
        for(int i = 1; i < str.size(); i++){
            if(str[i] == pre){
                count++;
            }else{
                res += to_string(count);
                res += pre;
                count = 1;
                pre = str[i];
            }
        }

        res += to_string(count);
        res += pre;
        return res;
    }
};

