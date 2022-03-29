class Solution {
public:
    bool XXX(TreeNode* root, int targetSum) {
        if(root==NULL) return false;
        queue<TreeNode*>q;
        q.push(root);
        queue<int>s;
        s.push(root->val);
        while(!q.empty())
        {
            TreeNode *t=q.front();
            int a=s.front();
            q.pop();
            s.pop();
            if(t->left==NULL && t->right==NULL && a==targetSum)
                return true;
            if(t->left)
                return XXX(t->left,targetSum-a);
            if(t->right) 
                return XXX(t->right,targetSum-a);
        }
        return false;
    }
};

