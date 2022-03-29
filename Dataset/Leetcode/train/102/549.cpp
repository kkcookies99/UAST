class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        if(!root) return vector<vector<int>>();
        vector<vector<int>> res;
        queue<TreeNode*> q;
        q.push(root);
        int count = 1; //当前层节点个数
        int n = 0; //当前节点的下一层的结点个数
        vector<int> v;

        while(q.size())
        {
            TreeNode* temp = q.front();
            q.pop();
            count--;
            v.push_back(temp->val);
            //当前结点的左右节点插入队列
            if(temp->left){
                q.push(temp->left);
                n++; 
            } 
            if(temp->right){
                q.push(temp->right);
                n++;
            }
            if(count == 0){
                res.push_back(v);
                v.clear();
                count = n;
                n = 0;
            }
        }
        return res;
    }
};

