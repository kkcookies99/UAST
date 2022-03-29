 class Solution {
public:
    bool XXX(TreeNode* p, TreeNode* q) {
        if(p == nullptr && q == nullptr)
        {
            return true;
        }
        else if(p == nullptr && q != nullptr || p != nullptr && q == nullptr)
        {
            return false;
        }
        else if (p->val != q->val) 
        {
            return false;
        }
        else
        {
            return XXX(p->left,q->left) && XXX(p->right,q->right);
        }
        
    }
};

