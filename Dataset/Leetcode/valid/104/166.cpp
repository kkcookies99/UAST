class Solution {
public:
    int maxl=0;
    void dfs(TreeNode* root,int now){
        if(!root){
            maxl=fmax(maxl,now-1);
            return;
        }
        dfs(root->left,now+1);
        dfs(root->right,now+1);
    }
    int XXX(TreeNode* root) {
        dfs(root,1);
        return maxl;
    }
};

