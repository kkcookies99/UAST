class Solution {
public:
    int XXX(TreeNode* root) {
        if(root == NULL) return 0;

        queue<TreeNode *> q;
        q.push(root);
        int deep = 1;

        while(!q.empty()) {
            int n = q.size();
            for(int i = 0; i < n; i++) {
                TreeNode* node = q.front();
                q.pop();
                if(node->left == NULL && node->right == NULL) {
                    return deep;
                }
                if(node->left) q.push(node->left);
                if(node->right) q.push(node->right);
            }
            deep++;
        }
        return deep;
    }
};

