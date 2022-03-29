 class Solution {
public:
    vector<int> helper(TreeNode* root, bool& flag) {
        if(root == nullptr) return {};
        vector<int> left = helper(root->left, flag);
        vector<int> right = helper(root->right, flag);
        if (flag == false) return {};
        vector<int> res;
        if (left.size() != 0) {
            if (root->val <= left[1]) {
                flag = false;
                return {};
            } else {
                res.push_back(left[0]);
            }
        } else {
            res.push_back(root->val);
        }
        if (right.size() != 0) {
            if (root->val >= right[0]) {
                flag = false;
                return {};
            } else {
                res.push_back(right[1]);
            }
        } else {
            res.push_back(root->val);
        }
        return res;

    }
    bool XXX(TreeNode* root) {
        bool flag = true;
        helper(root, flag);
        return flag;
    }
};

