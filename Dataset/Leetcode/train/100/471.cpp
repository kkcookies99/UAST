 class Solution {
public:
    bool XXX(TreeNode* p, TreeNode* q) {
        if(!p&&!q)return 1;
        else if(!p&&q||(!q&&p))return 0;
        return XXX(p->left,q->left)&&XXX(p->right,q->right)&&p->val==q->val;
    }
};

