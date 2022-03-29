 class Solution {
public:
void goalongleft(TreeNode*x,stack<TreeNode*> &s)
{
    while(x){s.push(x);x=x->left;}
}
    vector<int> XXX(TreeNode* root) {
        vector<int> ans;
        stack<TreeNode*> s;
        while(true)
        {
            goalongleft(root,s);
            if(s.empty())break;
            root=s.top();
            s.pop();
            ans.emplace_back(root->val);
            root=root->right;
        }

       return ans;
    }
};

