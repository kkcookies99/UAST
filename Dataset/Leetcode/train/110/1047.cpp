 class Solution {
public:
   
    bool XXX(TreeNode* root) {
        if(root == NULL) return true;
        //分别计算左子树 和 右子树的高度
        int llevel = caculate_level(root->left, 0);
        int rlevel = caculate_level(root->right, 0);
        return (abs(rlevel - llevel) <= 1) ? true : false;   
    }
    int caculate_level(TreeNode *p,  int level){
        if(p == NULL) return level;
        return max(caculate_level(p->left, level+1), caculate_level(p->right,level+1));
    }
};

