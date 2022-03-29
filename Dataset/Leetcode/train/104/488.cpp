class Solution {
public:
    int maxdep=0;
    int XXX(TreeNode* root) {
        DFS(root,1);
        return maxdep;
    }
    void DFS(TreeNode* root ,int depth){
        if(!root) return;
        if(!root->left && !root->right){
            if(depth>maxdep) maxdep=depth;
            return ;
        }
        if(root->left) DFS(root->left,depth+1);
        if(root->right) DFS(root->right,depth+1);
    }
};

