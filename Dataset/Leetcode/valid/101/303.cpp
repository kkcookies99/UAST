 class Solution {
public:
    bool XXX(TreeNode* root) {
          stack<TreeNode*> stk1;
          stack<TreeNode*> stk2;
          TreeNode* Lroot;
          TreeNode* Rroot;
          if (root->left == nullptr && root->right != nullptr) return false;
          if (root->left != nullptr && root->right == nullptr) return false;
          if (root->left == nullptr && root->right == nullptr) return true;
          Lroot = root->left;
          Rroot = root->right;
          stk1.push(Lroot);
          stk2.push(Rroot);
          while (!stk1.empty() || !stk2.empty()) {
              Lroot = stk1.top();
              Rroot = stk2.top();
              if (Lroot->val != Rroot->val)  return false;
              stk1.pop();
              stk2.pop();
              if (Lroot->right)
              {
                  if (Rroot->left) {
                      if (Lroot->right->val != Rroot->left->val)  return false;
                      stk1.push(Lroot->right);
                  }
                  else return false;
  
  
              }
              if (Lroot->left) {
                  if (Rroot->right) {
                      if (Lroot->left->val != Rroot->right->val) return false;
                      stk1.push(Lroot->left);
                  }
                  else return false;
              }
              if (Rroot->left) {
                  if (Lroot->right) {
                      if (Rroot->left->val != Lroot->right->val) return false;
                      stk2.push(Rroot->left);
                  }
                  else return false;
  
              }
              if (Rroot->right) {
                  if (Lroot->left) {
                      if (Rroot->right->val != Lroot->left->val) return false;
                      stk2.push(Rroot->right);
                  }
                  else return false;
              }
 
          }
          return true;
      }
 };

