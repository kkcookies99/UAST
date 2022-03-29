 class Solution {
public:
    int XXX(string s) {
        if(s.length() == 0) return 0;
        vector<int> vec(128, 0);//0-127的ASCII码
        int res = 0; //存放结果
        // i为左窗口，j为右窗口。用数组vec[*]来标记字符出现的次数，
        for (int i = 0, j = 0; j < s.length(); j++) {
            vec[s[j]]++;//遍历整个字符串，把对应字符的次数加1；
            while(vec[s[j]] > 1){ // 如果发现这个字符第二次出现，则移动左窗口直到窗口无重复字符，即到j的位置
                vec[s[i]]--;
                i++;
            }
            res = max(res,j-i+1);//j-i+1表示i和j之间的长度
        }
        return res;
    }
};

