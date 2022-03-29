 class Solution {
public:
    void bfs(int level, vector<int>& vc, TreeNode* root) {
        if (root == NULL) {
            return;
        }
        if (level == 0) { // 层数达到指定位置时返回数据
            vc.push_back(root->val);
            return;
        } else { // 否者继续递归进行左右分支的查找。
            bfs(level - 1, vc, root->left);
            bfs(level - 1, vc, root->right);
        }
    }
    int maxDepth(TreeNode* root) { // 获取二叉树的最大深度
        if (root == NULL) {
            return 0;
        } else {
            int ldp = maxDepth(root->left);
            int rdp = maxDepth(root->right);
            return ldp > rdp ? ldp + 1 : rdp + 1;
        }
    }
    vector<vector<int>> XXX(TreeNode* root) {
        vector<vector<int>> res;
        int depth = maxDepth(root);
        for (int i = 0; i < depth; i++) {
            vector<int> tmp;
            bfs(i, tmp, root); // 递归获得此层的所有数据
            res.push_back(tmp);
        }
        return res;
    }
};

