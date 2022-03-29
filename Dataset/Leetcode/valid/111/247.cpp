class Solution {
public:
    int XXX(TreeNode* root) {
        if (!root)
            return 0;
        queue<TreeNode*> q;
        q.push(root);
        int deepth = 0;
        while(!q.empty()) {
            deepth++;
            int size = q.size();
            for (int i = 0; i < size; ++i) {
                TreeNode *cur = q.front();
                q.pop();
                if (!cur->left && !cur->right)
                    return deepth;
                if (cur->left)
                    q.push(cur->left);
                if (cur->right)
                    q.push(cur->right);
            }
        }
        return deepth;
    }
};

