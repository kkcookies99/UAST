 class Solution {
public:
    vector<string> ans;
    void dfs(string tem,int cur,int n,int k){
        /* 答案都是“( _ _ _ _ )”形式的,下标以 0--> 2*n-1 表示，这里以n==3为例
        参数: tem回溯生成的结果临时值，
              cur是依次填写括号的顺序，
              k代表[0,cur)内还剩多少个没有配对的'('
        */
        if(cur == 2*n-1){   // 当cur遍历到最后一个')'的位置，产生一个结果，保存返回
            ans.push_back(tem+')');
            return;
        }
        if((cur+k+1)/2 < n){ // k + (cur+1-k)/2 为[0,cur)内'('的数量，如果小于n，则cur处可以填'('
            tem.push_back('(');
            dfs(tem,cur+1,n,k+1); 
            tem.pop_back();  // 删除 '(',尝试填 ')'
        }
        if(k>0){  // 如果[0,cur) 内还有未配对的'(',则cur处可填 ')'
            tem.push_back(')');
            dfs(tem,cur+1,n,k-1);
        }
    }
    vector<string> XXX(int n) {
        dfs("(",1,n,1);  // tem == "(", k == 1 , cur == 1
        return ans;
    }
};

