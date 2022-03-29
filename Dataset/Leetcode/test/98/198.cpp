 class Solution {
public:
    int v=INT_MIN;
    bool k=1;
    bool XXX(TreeNode* root) {
       if(root->left)  if(!XXX(root->left)) return 0;
       if(k&&root->val==INT_MIN&&v==INT_MIN) k=0;
       else if(v>=root->val) return 0;
       v=root->val;
       if(root->right) if(!XXX(root->right)) return 0;
       return 1; 

    }
};

