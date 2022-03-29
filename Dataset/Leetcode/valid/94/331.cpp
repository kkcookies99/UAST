 class Solution {
public:
    void in_order(TreeNode* root, vector<int>&ans)
    {
        if(root ==NULL)
        return;
        in_order(root->left, ans);
        ans.emplace_back(root->val);
        in_order(root->right,ans);
    }

    vector<int> XXX(TreeNode* root) {
        vector<int>ans;
        in_order(root, ans);
        return ans;

    }
};
