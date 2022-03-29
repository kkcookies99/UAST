 class Solution {
public:
    bool XXX(TreeNode* p, TreeNode* q) {
        if (p==NULL && q==NULL)      return true;
        else if (p==NULL || q==NULL) return false;

        TreeNode* pp, * qq;
        stack<TreeNode*> sp, sq;
        sp.push(p);
        sq.push(q);

        //先遍历二叉树
        //再判断是否有值、值是否相同
        while (sp.empty()!=true || sq.empty()!=true) {
            pp = sp.top();
            sp.pop();
            qq = sq.top();
            sq.pop();
            if (pp==NULL && qq==NULL) continue;
            else if (pp==NULL || qq==NULL) return false;
            else if (pp->val != qq->val) return false;
            else {
                sp.push(pp->left);
                sp.push(pp->right);
                sq.push(qq->left);
                sq.push(qq->right);
            }
        }
    
        return true;

    }
};

