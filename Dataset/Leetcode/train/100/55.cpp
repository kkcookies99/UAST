 class Solution {
public:
    bool XXX(TreeNode* p, TreeNode* q) {
        return dfs(p,q);
    }

    bool dfs(TreeNode* p, TreeNode* q){
        if(p == nullptr && q == nullptr){
            return true;
        }
        else if(p == nullptr || q == nullptr){
            return false;
        }

        return dfs(p->left,q->left) && dfs(p->right,q->right) && p->val == q->val;
    }
};

