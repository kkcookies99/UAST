 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        vector<int>res;
        if(root==NULL)
            return res;
        stack<TreeNode *>s;
        TreeNode *cur=root;
        while(!s.empty()||cur!=NULL)
        {
            if(cur!=NULL)
            {
                s.push(cur);
                cur=cur->left;
            }
            else
            {
                TreeNode *temp=s.top();
                res.push_back(temp->val);
                s.pop();
                cur=temp->right;
            }
        }
        return res;
    }
};

