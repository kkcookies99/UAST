 class Solution {
public:
    bool isSameTree(TreeNode* p, TreeNode* q) {
        if(!p&&!q){
            return true;
        }
        if(p&&q){
            if(p->val!=q->val){
                return false;
            }else{
                return isSameTree(p->left,q->right)&&isSameTree(p->right,q->left);
            }
        }
        return false;
    }
    bool XXX(TreeNode* root) {
        if(!root){
            return true;
        }
        return isSameTree(root->left,root->right);
    }
};

