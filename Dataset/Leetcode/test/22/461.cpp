 class Solution {
public:
    vector<string> XXX(int n) {
        queue<string> res_q;
        vector<string> res;
        res_q.push("");
        for(int i = 0;i<2*n;i++){
            int size_q = res_q.size();
            for(int j =0;j<size_q;j++){
                int left =n, right = n; //用来标记左右括号个数，便于判断是否合法
                string top_val = res_q.front();
                for(auto ch: top_val){
                    if(ch=='(') left--;
                    if(ch==')') right--;
                }
                if(left>=right){
                    res_q.push(top_val+'(');
                }
                else{
                    if(left>0) res_q.push(top_val+'(');
                    if(right>0) res_q.push(top_val+')');
                }
                res_q.pop();
            }
        }
        while(!res_q.empty()){
            res.push_back(res_q.front());
            res_q.pop();
        }
        return res;
    }
};

