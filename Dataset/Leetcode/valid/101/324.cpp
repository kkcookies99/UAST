 class Solution {
public:
    int f = 1;
    void dfs(TreeNode* root1,TreeNode* root2){
        if(!f) return ;
        if(!root1&&!root2) return ;
        if(!root1&&root2){
            f=0;return ;
        } 
        if(root1&&!root2){
            f =0;return;
        }
        if(root1->val!=root2->val){
            f=0;
            return ;
        }
        dfs(root1->left,root2->right);
        dfs(root1->right,root2->left);
    }
    bool XXX(TreeNode* root) {
        
        dfs(root->left,root->right);
        if(f) return 1;
        return 0;
    }     
};

