 class Solution {
public:
    int XXX(string s) {
        if(s.size() == 0)   //s为空，直接返回0
            return 0;
        int maxlen = 1; //先让最大长度等于 1
        int flag = 0;  // 标记出现相同字符时的位置
        for(int i = 1; i < s.size(); i++){
            int len = 1;    //从下标为 1 开始遍历
            for(int j = i; j > flag; j--){
                if(s[i] != s[j-1]){ //与前一个字符做比较
                    len++;
                }else{
                    flag = j;   //标记出现相同字符的位置
                    break;
                }
                maxlen = max(maxlen, len);
            }
        }
        return maxlen;
    }
};

