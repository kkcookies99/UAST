class Solution {
public:
    int XXX(TreeNode* root) {
      if(root==NULL)
      {
          return 0;
      }
      else
      {
          int l=XXX(root->left);
          int r=XXX(root->right);
          return l>r?l+1:r+1;
      }
    }
};

