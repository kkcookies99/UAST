class Solution {
public:
    int dfs(TreeNode* root, bool &isBalance){
        if(!root){
            return -1;
        }else{
            int r = dfs(root->right, isBalance);
            int l = dfs(root->left, isBalance);
            isBalance = isBalance && (abs(r-l) < 2);
            return max(r,l) + 1;
        }
    }

    bool XXX(TreeNode* root) {
        bool ans = true;
        dfs(root,ans);
        return ans;
    }
};

