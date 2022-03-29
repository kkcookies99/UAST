 class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        if(root==NULL)return false;
        
        return dfs(root,0,sum);
    }

   bool dfs(TreeNode* root,int count,int sum){
       if(root==NULL)return false;
       count+=root->val;
        if(root->left==NULL&&root->right==NULL){
            if(count==sum){
                return true;
            }
        }
        
        return dfs(root->left,count,sum)||dfs(root->right,count,sum);  
    }
};

