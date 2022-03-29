class Solution {
public:
    int goDown(TreeNode* x,int depth)
    {
        if(x==nullptr) return depth;
        ++depth;
        return max(goDown(x->left,depth),goDown(x->right,depth));
    }
    int XXX(TreeNode* root) {
        return goDown(root,0);
    }
};

