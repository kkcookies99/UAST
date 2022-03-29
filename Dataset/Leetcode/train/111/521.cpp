class Solution {
public:
    int XXX(TreeNode* root) {
        if (root == nullptr) return 0;
        queue<pair<TreeNode*, int>> Q; Q.push(make_pair(root, 1));
        while (!Q.empty()) {
            auto p =  Q.front(); Q.pop();
            TreeNode* node = p.first; int height = p.second;
            if (node -> left == nullptr && node -> right == nullptr) return height; // 当前节点是叶子节点
            if (node -> left) Q.push(make_pair(node -> left, height + 1));
            if (node -> right) Q.push(make_pair(node -> right, height + 1));
        }
        return 0;
    }
};

