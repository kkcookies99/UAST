 class Solution {
public:

    void isSame(TreeNode* p, TreeNode* q, bool& same){

        if(p ==nullptr || q == nullptr) return;

        if(p->val != q->val) same = false;
        bool a = p->left == nullptr ? false : true;
        bool b = p->right == nullptr ? false : true;

        bool a1 = q->left == nullptr ? false : true;
        bool b1 = q->right == nullptr ? false : true;

        if(a^a1 || b^b1) same = false;

        isSame(p->left, q->left, same);
        isSame(p->right, q->right, same);

    }

    bool XXX(TreeNode* p, TreeNode* q) {
        if(p ==nullptr && q != nullptr) return false;
        if(p !=nullptr && q == nullptr) return false;

        bool isSameFlag = true;
        isSame(p,q,isSameFlag);
        return isSameFlag;
    }
};

