 class Solution {
public:
    bool flag = true;
    void traverse(TreeNode* p, TreeNode* q){
        if(p == nullptr && q == nullptr)
            ;
        else if(p!=nullptr && q !=nullptr)
        {
            traverse(p->left,q->left);
            traverse(p->right,q->right);
            if(p->val!=q->val)
                flag = false;
        }
        else 
            flag = false;
        return;
    }
    bool XXX(TreeNode* p, TreeNode* q) {
        traverse(p,q);
        return flag;
    }
};

