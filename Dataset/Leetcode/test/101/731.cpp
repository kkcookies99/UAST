 class Solution {
public:
    bool XXX(TreeNode* root) {
        return ism(root,root);


    }

    bool ism(TreeNode* root,TreeNode* root1){
        if(root==NULL&&root1==NULL)return true;
        
        if((root==NULL&&root1!=NULL)||(root!=NULL&&root1==NULL)){
            return false;
        }
        if(root->val!=root1->val){
            return false;
        }

        return ism(root->left,root1->right)&&ism(root->right,root1->left);
       
        
    }
};

