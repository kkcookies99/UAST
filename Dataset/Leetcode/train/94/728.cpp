 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        vector<int> res; 
        stack<TreeNode*> S; TreeNode *p = root;
        while(p || !S.empty()) {
            while(p) {
                S.push(p);
                p = p->left;
            }
            res.push_back(S.top()->val); 
            p = S.top()->right; S.pop();
        }
        return res;
    }
};

