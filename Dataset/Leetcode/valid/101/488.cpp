 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(root==NULL) return true;
        else
            return isMirror(root->left,root->right);
    }
    bool isMirror(TreeNode *Lefttree,TreeNode *Righttree){
        if(Lefttree==NULL&&Righttree==NULL) return true;
        if(Lefttree==NULL||Righttree==NULL) return false;
        if(Lefttree->val!=Righttree->val) return false;
        return isMirror(Lefttree->left,Righttree->right)&&isMirror(Lefttree->right,Righttree->left);
    }
};

