 class Solution {
public:
    bool XXX(TreeNode* root) 
    {
      vector<int> s1;
      vector<int> s2;
      preOderLeft(s1,root->left);
      preOderRight(s2,root->right);
      if(s1!=s2) return false;
      return true;
    }

    void preOderLeft(vector<int>& s,TreeNode* root)
    {
      if(!root) 
      {
        s.push_back(101);
        return;
      }
      if(!root->left&&!root->right) 
      {
        s.push_back(root->val);
        return;
      }
      s.push_back(root->val);
      preOderLeft(s,root->left);
      preOderLeft(s,root->right);
    }
    void preOderRight(vector<int>& s,TreeNode* root)
    {
      if(!root) 
      {
        s.push_back(101);
        return;
      }
      if(!root->left&&!root->right) 
      {
        s.push_back(root->val);
        return;
      }
      s.push_back(root->val);
      preOderRight(s,root->right);
      preOderRight(s,root->left);
    }
};

