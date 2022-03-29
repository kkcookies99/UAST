 class Solution {
public:
    vector<string> ans;    //结果集
    string a;              //递归操作的变量，作为类成员变量操作减少耗时
    void dfs(int n , int pre){
        if(n == 0){        //递归结束条件
            ans.emplace_back(a);
            return ;
        }
        for(int i = pre + 1 ; i < a.size() ; i++){
            a.insert(i + 1 , "()");    //在i+1处插入，例如"--"在pos=1处插入"++"就是"-++-"
            dfs(n - 1 , i);
            a.erase(i + 1 , 2);        //回溯
        }
    }
    vector<string> XXX(int n) {
        if(n == 0)    return ans;
        a = "()";               //初始化a
        dfs(n - 1 , -1);        //传-1让其从pos=0处开始操作
        return ans;
    }
};

