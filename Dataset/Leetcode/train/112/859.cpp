 class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        if(!root)return false;
        int sum_t = 0;
        bool bfind = false;
        function<bool(TreeNode *,int)> XXX_lambda = 
        [&XXX_lambda,&sum_t,&bfind](TreeNode* root, int sum)->bool
        {    
            if(bfind)return true;       
            sum_t += root->val; 
            if(root->left)  XXX_lambda(root->left,sum);                    
            if(root->right) XXX_lambda(root->right,sum); 
            if(!root->left && !root->right)
            {
                if(sum_t == sum)
                bfind = true;
            }
            sum_t -= root->val;
            return bfind;
        };   
        return XXX_lambda(root,sum);    
    }
};

