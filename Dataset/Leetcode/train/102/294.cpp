class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        queue<TreeNode*> qe,eq;
        vector<vector<int>> res;
        if(!root) return res;
        vector<int> tmp;
        tmp.push_back(root->val);
        res.push_back(tmp);
        tmp.clear();
        qe.push(root);
        while(!qe.empty())
        {
            while(!qe.empty())
            {
                if(qe.front()->left) {eq.push(qe.front()->left);tmp.push_back(qe.front()->left->val);}
                if(qe.front()->right) {eq.push(qe.front()->right);tmp.push_back(qe.front()->right->val);}
            qe.pop();
            }
            if(!tmp.empty()) res.push_back(tmp);
            tmp.clear();
            qe.swap(eq);
        }
        return res;
    }
};

