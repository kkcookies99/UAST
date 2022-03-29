 class Solution {
public:

    bool dfs(TreeNode *t1,TreeNode *t2){
        if(t1 == NULL && t2 == NULL){
            return true;
        }else if(t1 != NULL && t2 != NULL){
            return (t1->val == t2->val) && dfs(t1->left,t2->right) && dfs(t1->right,t2->left);
        }else{
            return false;
        }
    }

    bool XXX(TreeNode* root) {
        if(root == NULL){
            return true;
        }else{
            return dfs(root->left,root->right);
        }
    }
};

