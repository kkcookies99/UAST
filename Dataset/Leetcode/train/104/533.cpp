class Solution {
public:
    int XXX(TreeNode* root) {
        if(root==NULL)return 0;
        else{
            int ld=XXX(root->left);
            int rd=XXX(root->right);
            return 1+((ld>rd)?ld:rd);
        }   
    }
};

