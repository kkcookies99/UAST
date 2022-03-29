 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(root==nullptr)return true;
        return dfs(root->left,root->right);
    }
    bool dfs(TreeNode* root1,TreeNode* root2){
        if(root1==nullptr && root2==nullptr)return true;
        if(root1==nullptr || root2==nullptr)return false;
        if(root1->val!=root2->val)return false;
        return dfs(root1->left,root2->right)&& dfs(root1->right,root2->left);
    }
};

