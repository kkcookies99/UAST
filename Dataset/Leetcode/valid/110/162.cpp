class Solution {
public:
    bool ans;
    bool XXX(TreeNode* root) {       
        ans=true;
        dfs(root);
        return ans;
    }
    
    int dfs(TreeNode* root){
        if(!root) return 0;
        int lh=dfs(root->left),rh=dfs(root->right);
        if(abs(lh-rh)>1) ans=false;
        return max(lh,rh)+1;
    }
};

