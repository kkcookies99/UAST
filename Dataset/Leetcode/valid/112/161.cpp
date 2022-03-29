class Solution {
public:  
    bool fun(TreeNode*root ,int targetSum,int path){
//回溯
        if(!root)return false;
        if(path==targetSum&&!root->left&&!root->right)return true;
        if(root->left){
            if(fun(root->left,targetSum,path+root->left->val))return true;
            }
        if(root->right){
            if(fun(root->right,targetSum,path+=root->right->val))return true;
            }
      
        return false;
    }
    bool XXX(TreeNode* root, int targetSum) {
     if(!root)return false;
      return  fun(root,targetSum,root->val);
    }
};

