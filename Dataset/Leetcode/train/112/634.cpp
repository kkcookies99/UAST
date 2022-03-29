 class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        int target=0;
        return dfs(root,target,sum);
    }
    bool dfs(TreeNode* root, int target, const int sum){
        if(root==nullptr) return false;
        target+=root->val;
        if(target==sum&&root->left==nullptr&&root->right==nullptr) return true;
        else return dfs(root->left,target,sum)||
            dfs(root->right,target,sum);
    }
};

