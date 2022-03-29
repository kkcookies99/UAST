 class Solution {
public:
    bool XXX(TreeNode* root) {
        vector<int> res;
        collect(res,root);
         for(int i=1;i<res.size();i++){
            if(res[i]<=res[i-1])
               return false;
         }
         return true;
    }
    void collect(vector<int>& res,TreeNode* root){
         if(root==nullptr)
          return;
          collect(res,root->left);
          res.push_back(root->val);
          collect(res,root->right);
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


