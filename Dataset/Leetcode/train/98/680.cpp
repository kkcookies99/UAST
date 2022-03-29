 class Solution {
public:
    vector<int> res;
    vector<int> inorderTraversal(TreeNode* root) {
        if (root == NULL)
            return {};
        if (root->left)
            inorderTraversal(root->left);
        if (root->val != NULL) {
            res.push_back(root->val);
        }
        if (root->right)
            inorderTraversal(root->right);
        return res;
    }
    bool XXX(TreeNode* root) {
        if (root == nullptr)
            return true;
       vector<int> ans =inorderTraversal(root);
        for (int i = 1; i < ans.size(); i++) {
            if (ans[i] <= ans[i - 1])
                return false;
        }

        return true;
    }
};
为什么我的有测试用例不能通过，树实现不方便dubug，找不到原因

