class Solution {
public:
    bool XXX(TreeNode* root) {
        return height_XXX(root).second;
    }
    pair<int,bool> height_XXX(TreeNode* root){
        if(root==nullptr)return {0,true};
        auto [leftheight,leftIsBalanced]=height_XXX(root->left);
        if(!leftIsBalanced)return {-1,false};
        auto [rightheight,rightIsBalanced]=height_XXX(root->right);
        if(!rightIsBalanced)return {-1,false};
        return {max(leftheight,rightheight)+1,abs(leftheight-rightheight)<=1};
    }
};

