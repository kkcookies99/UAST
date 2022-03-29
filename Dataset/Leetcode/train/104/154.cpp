class Solution {
public:
    int XXX(TreeNode *root)
    {
        // 左右子树最大值 + 1 嘛
        if (root == nullptr) {
            return 0;
        }
        return max(XXX(root->left), XXX(root->right)) + 1;
    }
    // 104. 层序计数
    int XXX2(TreeNode *root)
    {
        // 层序遍历来说，就是最后一层的计数值
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

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


