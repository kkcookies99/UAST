 class Solution {
public:
    bool subtree(TreeNode* L,TreeNode* R){
        if(L==NULL && R==NULL) return true;
        else if(!L || !R) return false;
        else  return (L->val == R->val) && (subtree(L->left,R->right)) && (subtree(L->right,R->left));
    }
    bool XXX(TreeNode* root) {
        if(root==NULL) return true;
        else return subtree(root->left,root->right);
    }
};

