class Solution {
public:
    int min=100005;
    int XXX(TreeNode* root) {
        if(root==nullptr)return 0;
        return deep(root,1);
    }
    int deep(TreeNode* root,int lev){
        if(root==nullptr)return min;
        if(root->left==nullptr&&root->right==nullptr){
            if(lev<min)min=lev;
            return min;
        }
        deep(root->right,lev+1);
        deep(root->left,lev+1);
        return min;
    }
};

