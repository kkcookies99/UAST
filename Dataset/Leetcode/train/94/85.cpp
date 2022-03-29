 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        vector<int> ans;
        stack<TreeNode*> s;
        s.push(root);
        TreeNode *p;
        while(!s.empty()){
            while(p=s.top()){
            s.push(p->left);
            }
            s.pop();
            if(!s.empty()){
                p = s.top();s.pop();
                ans.push_back(p->val);
                s.push(p->right);
            }
        }
        return ans;
    }
};

