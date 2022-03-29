 class Solution {
public:
   vector<int> a;
   vector<int> XXX(TreeNode* root) {
       zhongxubianli(root);
       return a;
   }
   void zhongxubianli(TreeNode* root){
       if(root==NULL) return;
       zhongxubianli(root->left);
       a.push_back(root->val);
       zhongxubianli(root->right);
   }
};

