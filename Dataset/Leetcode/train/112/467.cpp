 class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        if (root == nullptr) {
            return false;
        }

        int tmp = 0;
        stack<TreeNode*> stk;
        unordered_set<TreeNode*> set_;
        while (root != nullptr || !stk.empty()) {
            if (root != nullptr) {
                tmp = tmp + root->val;
                if (tmp == sum && root->right == nullptr && root->left == nullptr) {
                    return true;
                }
                stk.push(root);
                set_.insert(root);
                root = root->left;
            } else {
                root = stk.top();
                bool leftVisited = true;
                bool rightVisited = true;
                if (root->left && set_.find(root->left) == set_.end()) {
                    leftVisited = false;
                }
                if (root->right && set_.find(root->right) == set_.end()) {
                    rightVisited = false;
                }
                if (leftVisited && rightVisited) {
                    stk.pop();
                    tmp = tmp - root->val;
                }
                if (rightVisited == false) {
                    root = root->right;
                } else {
                    root = nullptr;
                }
            }
        }
        return false;
    }
};

