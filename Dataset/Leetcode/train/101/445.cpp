 class Solution {
public:
    bool get(TreeNode*root,TreeNode*rootx){
        if(root==nullptr&&rootx==nullptr) return true;
        if(root==nullptr&&rootx!=nullptr) return false;
        if(root!=nullptr&&rootx==nullptr) return false;
        if(root->val==rootx->val){
            if(!get(root->left,rootx->right)) return false;
            if(!get(root->right,rootx->left)) return false;
            }
        else return false;
        return true;
    }
    bool XXX(TreeNode* root) {    
        return get(root,root);      
        
    }
};

