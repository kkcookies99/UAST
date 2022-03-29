 class Solution {
public:
    bool XXX(TreeNode* p, TreeNode* q) {

        if(p==NULL && q==NULL){
            return true;
        }

        if(p==NULL && q!=NULL){
            return false;
        }
        if(p!=NULL && q==NULL){
            return false;
        }
        
        if(p->val != q->val){
            return false;
        }

        bool leftVal = XXX(p->left, q->left);
        bool rightVal = XXX(p->right, q->right);

        return (leftVal && rightVal);
    }
};

