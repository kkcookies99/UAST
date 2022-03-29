class Solution {
public:
    int i = 0,tmpMax=0;
    int XXX(TreeNode* root) {
        if(root == NULL) return 0;
        i++;
        tmpMax = tmpMax>i?tmpMax:i;
        XXX(root->left);
        XXX(root->right);
        i--;
        return tmpMax;
    }
};

