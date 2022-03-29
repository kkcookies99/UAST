 class Solution {
public:
    static const long long INF_MIN = -2147483658;
    static const long long INF_MAX = 2147483657;
    
    bool helper(TreeNode* root, long min,long max, bool isleft ){
        
        if (root==NULL) return true;
        if(isleft){
            return root->val < max && root->val > min &&
            helper(root->left,min,root->val,true) &&
            helper(root->right, root->val,max, false);
        }else{
            return root->val > min && root->val < max &&
            helper(root->left,min,root->val,true) &&
            helper(root->right, root->val,max,false);
        }
    }
    bool XXX(TreeNode* root) {
        return root?helper(root->left,INF_MIN,root->val,true) &&
             helper(root->right,root->val,INF_MAX,false):true;
    }
};

