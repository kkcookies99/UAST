 class Solution {
public:
    bool XXX(TreeNode* root) {
        if (root==nullptr) return true;
        bool res = leftRight(root->left, root->right);
        return res;
    }

    bool leftRight(TreeNode* p, TreeNode* q){
        if (p==nullptr && q==nullptr) return true;
        if (p==nullptr || q==nullptr) return false;
        if (p->val!=q->val) return false;
        bool outerEqual = leftRight(p->left, q->right);
        bool innerEqual = leftRight(p->right, q->left);
        if (outerEqual && innerEqual) return true;
        return false;
    }
};

