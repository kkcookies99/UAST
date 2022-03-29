class Solution {
public:
    bool XXX(TreeNode* root) {
        if(!root) return true;
        return XXX(root->left)  && 
               XXX(root->right) &&
               abs(hight(root->left) - hight(root->right)) <= 1;
    }

    int hight(TreeNode* n){
        if(!n) return 0;
        int lh = hight(n->left);
        int rh = hight(n->right);
        return max(lh, rh)+1;
    }
};

