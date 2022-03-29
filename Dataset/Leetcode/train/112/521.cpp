 class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
      if(root==nullptr) return false;
      if(root->left==nullptr&&root->right==nullptr){
          if(root->val==sum) return true;
      }
      if(XXX(root->left,sum-root->val)) return true;
       if(XXX(root->right,sum-root->val)) return true;
       return false;
    }
};

