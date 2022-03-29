 class Solution {
public:
    vector<int> ans;
    vector<int> XXX(TreeNode* root) {
        if(root==NULL) return ans;
        if(root->left) XXX(root->left);
        ans.push_back(root->val);
        if(root->right) XXX(root->right);
        return ans;
    }
};

