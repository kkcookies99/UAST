class Solution {
public:
    int XXX(TreeNode* root) {
        int ret = 0;
        if (!root) return ret;

        queue<TreeNode*> que;
        que.push(root);
        while(!que.empty()) {
            int levelSize = que.size();
            for (int i = 0; i < levelSize; ++i) {
                auto u = que.front();
                que.pop();
                if (u->left) que.push(u->left);
                if (u->right) que.push(u->right);
            }
            ret ++;
        }
        return ret;
    }
};

