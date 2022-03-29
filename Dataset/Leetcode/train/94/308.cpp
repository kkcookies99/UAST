 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        vector<int> ans;
        handle(root, ans);
        return ans;
    }
    void handle(TreeNode* root, vector<int>& ans)
    {
        if(root == nullptr) {
            return;
        } 
        if(root->left) {
            handle(root->left, ans);
        }
        ans.push_back(root->val);
        if(root->right) {
            handle(root->right, ans);
        }
        return;
    }
};

