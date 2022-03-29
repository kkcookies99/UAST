 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        stack<TreeNode*> S;
        TreeNode* p = root;
        vector<int> ans;
        while(!S.empty() || p)
        {
            if(p)
            {
                S.push(p);
                p = p->left;
            }
            else
            {
                p = S.top();
                ans.push_back(p->val);
                S.pop();
                p = p->right;
            }
        }
        return ans;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


