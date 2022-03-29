class Solution {
public:
  // 最优解
  int XXX(TreeNode* root) {
    if (not root) return 0;
    return 1 + max(XXX(root->left), XXX(root->right));
  }

};

