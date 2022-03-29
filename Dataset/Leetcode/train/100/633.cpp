 class Solution {
public:
    bool XXX(TreeNode* p, TreeNode* q) {
        if (p == nullptr && q == nullptr){
            return true;
        }else if ((p != nullptr && q == nullptr) || (p == nullptr && q != nullptr)){
            return false;
        }

        bool left = XXX(p->left, q->left);
        bool right = XXX(p->right, q->right);
        if (left && right && (p->val == q->val)){
            return true;
        }else{
            return false;
        }
    }
};

