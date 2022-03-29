class Solution {
public:
    int XXX(TreeNode* root) {
        // 到叶子节点的最小深度
        if (root == nullptr){
            return 0;
        }
        if (root->left && root->right){ // 左右都有孩子
            return min(XXX(root->left), XXX(root->right)) + 1;
        }else if (!root->left && !root->right){// 左右都无孩子
            return 1;
        }else if (!root->left){
            return 1 + XXX(root->right);
        }else{
            return 1 + XXX(root->left);
        }
    }
    int XXX2(TreeNode* root) {
        // 层序遍历来说，找到一个叶子节点即可返回
        int depth = 0;
        queue<TreeNode *> q;
        if (root) {
            q.push(root);
        }
        while (!q.empty()) {
            ++depth;
            int n = q.size();
            for (int i = 0; i < n; ++i) { // for循环遍历一层节点
                TreeNode *node = q.front();
                if (!node->left && !node->right){// 当前节点是叶子结点诶
                    return depth;
                }
                q.pop();
                if (node->left) {
                    q.push(node->left);
                }
                if (node->right) {
                    q.push(node->right);
                }
            }
        }
        return depth;
    }
};

