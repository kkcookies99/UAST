 class Solution {
public:
    vector<string> XXX(int n) {
        // 1.必须有一个右括号的池子
        // 2.池子有东西的时候 && 左括号还有剩余的时候，可以放( 或者 )
        // 3.池子没东西的时候 && 左括号还有剩余的时候，放 ( 
        // 4.池子没东西的时候 && 左括号无的时候，结束，字符串放入结果
        // 5.池子有东西的时候 && 左括号无剩余的时候，放 ) 
        vector<string> result;
        gene_v2("", n, 0, result, n);
        return result;


    }
    void gene_v2(string prefix, int left_num, int pool_num, vector<string>& result, int n){
        // prefix 代表已经搞定的字符串前缀，left_num：还剩多少个左括号，pool_num:还有多少个右括号quota
        // result: 表示结果

        // 搞完收工返回
        if (prefix.size() == 2*n) {
            result.push_back(prefix);
            return;
        }
        if(pool_num > 0 && left_num > 0) {
            gene_v2(prefix+"(", left_num-1, pool_num+1, result, n);
            gene_v2(prefix+")", left_num, pool_num-1, result, n);
            return;
        }
        if (pool_num > 0 && left_num <= 0) {
            gene_v2(prefix+")", left_num, pool_num-1, result, n);
            return;
        }
        if (pool_num <=0 && left_num > 0) {
            gene_v2(prefix+"(", left_num-1, pool_num+1, result, n);
            return;
        }

    }
};

