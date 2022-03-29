class Solution {
public:
    bool judge(TreeNode* root,int &dep){
        if(root == NULL){
            dep = 0;
            return true;
        } 
        int depl,depr;
        bool bl,br;
        bl = judge(root->left,depl);
        br = judge(root->right,depr);
        dep = max(depl,depr)+1;
        return bl&&br&&(abs(depl-depr)<2);
    }
    bool XXX(TreeNode* root) {
        int dep;
        return judge(root,dep);
    }
};


