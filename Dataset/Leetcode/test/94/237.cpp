 class Solution {
public:
    vector<int> nums;
    vector<int> XXX(TreeNode* root) {
        
        if (root == NULL)
            return nums;
        XXX(root->left);
        nums.push_back(root->val);
        XXX(root->right);

        return nums;
    }
};

