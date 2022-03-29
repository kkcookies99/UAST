 class Solution {
public:
//回溯的时候，查看是否是加(还是加)
    vector<string> ans;
    string tmp = "";
    void  generate(int n,int n1,int n2){//n表示括号对数,n1表示左括号，n2表示右括号
        //结果存储条件
        if(n1 == n && n2 == n){
            ans.push_back(tmp);
            return ;
        }
        //结果回溯选择
        if(n > n1){
            tmp += '(';
            generate(n,n1 + 1,n2);
            tmp.pop_back();
        }
        if(n1 > n2){
             tmp += ')';
            generate(n,n1,n2 + 1);
            tmp.pop_back();
        }
        return;
    }  
    vector<string> XXX(int n) {
        generate(n,0,0);
        return ans;
    }
};

