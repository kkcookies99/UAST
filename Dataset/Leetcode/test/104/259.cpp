class Solution {
public:
    int getdepth(TreeNode* q, int dep){
        if (q!=nullptr){
            dep++;
            return max(getdepth(q->left, dep), getdepth(q->right, dep));
        }
        return dep;
    }

    int XXX(TreeNode* root) {
        int ret = 0;
        return getdepth(root, ret);
    }
};

