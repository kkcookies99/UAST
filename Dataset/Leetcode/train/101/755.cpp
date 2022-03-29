 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(root==nullptr) return true;
        else  return isSame(root->left,root->right);
    }
    bool isSame(TreeNode* p,TreeNode* q) {
        if(p==nullptr&&q==nullptr) return true;
        if(!(p&&q)||p->val!=q->val) return false; //
        return isSame(p->left,q->right)&&isSame(q->left,p->right);
    }
};

