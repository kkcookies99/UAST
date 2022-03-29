class Solution {
public:
    // 模拟题
    string XXX(int n) {
        // 迭代计算结果 初始化为1
        string ans = "1";

        // 只需要计算n-1次；如果n为1，可以直接返回ans
        for (int t = 1; t < n; t++) {
            char tmp = ans[0];
            int cnt = 0;
            // 新的字符串用来记录新的外观数列
            string new_ans = "";
            for (int i = 0; i < ans.size(); i++) {
                // 和前面的数字相同 计数器+1
                if (ans[i] == tmp) cnt++;
                else {
                    // 不同的时候，我们就应该把之前的计数和对应的数字拼接起来了
                    // count + number_string
                    new_ans += to_string(cnt) + tmp;
                    // 将新的数字和出现次数1记录 继续进行相同的迭代操作
                    tmp = ans[i];
                    cnt = 1;
                }
            }
            // 迭代完成时；tmp里还存有最后一组不同的数字；不要遗漏
            new_ans += to_string(cnt) + tmp;
            
            ans = new_ans;
        }

        return ans;
    }
};

