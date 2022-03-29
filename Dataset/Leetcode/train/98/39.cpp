 class Solution {
public:
    vector<int>vec;
    bool XXX(TreeNode* root) {
        track(root);
        for(int i=1;i<vec.size();i++)
            if(vec[i]<=vec[i-1])
                return false;
        return true;
    }
    void track(TreeNode* root){
        if(!root)   return ;
        if(root->left)  
            XXX(root->left);
        vec.push_back(root->val);
        if(root->right)
            XXX(root->right);
        return;
    }
};

