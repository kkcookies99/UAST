class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {   
        vector<vector<int>> res;
        bfs(root, res);
        return res;
    }

    void bfs(TreeNode* root, vector<vector<int>>& res) {

        //判断空
        if (!root) return;

        //初始化队列
        queue<TreeNode*> q;

        //start节点入队，即根节点入队
        q.push(root);

        //遍历队列
        while (!q.empty()) {
            vector<int> temp;
            //确定每层的节点数量
            int sz = q.size();

            //一个循环会将每层的所有节点遍历，同时将下一层所有节点入队
            for (int i=0; i<sz; i++) {

                //获取先入队节点
                TreeNode *cur = q.front();
                //弹出， void类型
                q.pop();

                //判断当前节点是否为空，其实无必要，可以删除
                if (!cur) {
                    continue;
                } 
                
                //打印当前节点值
                temp.push_back(cur->val);
                
                //将不为空的左右子节点入队
                if (cur->left) {
                    q.push(cur->left);
                }
                if (cur->right) {
                    q.push(cur->right);
                }
                
            }
            if (sz > 0)
                res.push_back(temp);
        }
    }
};

