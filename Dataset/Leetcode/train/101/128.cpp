 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(!root) return true;
        queue<TreeNode*> q;
        q.push(root->left);
        q.push(root->right);
        
        while(!q.empty()){
            TreeNode* m = q.front(); q.pop();
            TreeNode* n = q.front(); q.pop(); 
            if(!m ^ !n)
                return false;
            if(!m && !n)
                continue;
            if(m->val != n->val)
                return false;            
            q.push(m->left); q.push(n->right);
            q.push(n->left); q.push(m->right);   
        }
        return true;  
    }
};

