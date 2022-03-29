class Solution {
public:
    bool bfs(TreeNode* root, int targetSum) {
        if(root == NULL) return {};
        queue<TreeNode *> q;
        queue<int> val;
        TreeNode *p = root;
        q.push(p);
        val.push(p->val);
        while(q.size()) {
            int size = q.size();
            for(int i = 0; i < size; ++i) {
                TreeNode *node = q.front(); 
                int pre = val.front();
                q.pop();
                val.pop();
                if(node->left == NULL && node->right == NULL && pre == targetSum)
                    return true;
                if(node->left) {
                    q.push(node->left);
                    val.push(node->left->val + pre);
                }
                if(node->right) {
                    q.push(node->right);
                    val.push(node->right->val + pre);
                }
            }
        }
        return false;
    }
    bool XXX(TreeNode* root, int targetSum) {
        return bfs(root,targetSum);
    }
};

