 class Solution {
public:
    bool same(TreeNode *t1, TreeNode *t2)
    {
        if (!t1 && !t2) return true;    // 如果都是空结点，则认为对称
        else if(t1 && t2)               // 如果同时拥有左右子女，则判断左右子女是否对称，并且该结点的值需要相同
            return (t1 -> val == t2 -> val) && same(t1 -> left, t2 -> right) && same(t1 -> right, t2 -> left);
        else return false;              // 否则两个结点一个为空，一个不为空，不可能对称
    }

    bool XXX(TreeNode* root) {
        return same(root -> left, root -> right);
    }
};

