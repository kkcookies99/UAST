class Solution {
public:
    bool XXX(TreeNode* root) {
        if(helper(root)==-1)
            return false;
        else
            return true;
    }
    int helper(TreeNode* root){
        if(!root)
            return 0;
        int leftH=0;
        if(root->left){
            leftH=helper(root->left);
            if(leftH==-1)
                return -1;
        }
        int rightH=0;
        if(root->right){
            rightH=helper(root->right);
            if(rightH==-1)
                return -1;
        }
        if(abs(leftH-rightH)<=1)
            return max(leftH,rightH)+1;
        else
            return -1;
    }

};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


