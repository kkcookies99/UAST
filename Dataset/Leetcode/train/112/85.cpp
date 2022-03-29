class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        if (!root) return false;
        stack<pair<TreeNode*,int>> stk;
        stk.push(pair<TreeNode*,int>(root, root->val));
        while (!stk.empty()) {
            auto cur = stk.top();
            stk.pop();
            TreeNode* curNode = cur.first;
            int curSum = cur.second;
            if (curNode->right) {
                stk.push(pair<TreeNode*,int>(curNode->right, curSum + curNode->right->val));
            }
            if (curNode->left) {
                stk.push(pair<TreeNode*,int>(curNode->left, curSum + curNode->left->val));
            }
            if (!curNode->left && !curNode->right) {
                if (curSum == sum) return true;
            }
        }
        return false;
    }
};

