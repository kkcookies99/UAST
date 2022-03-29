 class Solution {
public:
    int XXX(string s) {
        // 如果长度为0，直接return
        if(s.size() == 0){
            return 0;
        }

        int result = 1, // 最终答案
            head = 0, // 窗口的左边
            tail = 1, // 窗口的右边
            length = s.size(); // 整个string的长度

        unordered_set<char> chars({s[0]}); //生成set来记录窗口内的所有字符

        // 确保窗口右边覆盖整个string
        while(tail < length){
            // 窗口左端向右移动直到窗口内没有重复字符
            while(chars.find(s[tail]) != chars.end()){
                // 确保窗口左端不超过右端
                if(head >= tail){
                    break;
                }
                chars.erase(s[head]);
                head++;
            }
            // 比较新的窗口长度
            if( (tail-head+1) > result){
                result = tail-head+1;
            }
            // 将窗口右端字符加入set
            chars.insert(s[tail]);
            // 窗口右端右移
            tail++;
        }

        return result;
    }
};

