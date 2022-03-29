 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        if (!root) {
            return {};
        }
        XXX(root->left);
        result.push_back(root->val);
        XXX(root->right);
        return result;
    }
private:
    vector<int> result;
};

