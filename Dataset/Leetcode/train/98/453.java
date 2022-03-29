 class Solution {
    vector<int> a;
    void dfs(TreeNode* head)
    {
        if(head)
        {    
             dfs(head->left);
             a.push_back(head->val);
             dfs(head->right);
            
        }
    }
public:
    bool XXX(TreeNode* root) {
         dfs(root);
         for(int i=0;i<a.size()-1;i++)
         {
             if(a[i]>=a[i+1])
             return false;
         }
         return true;
    }
};

