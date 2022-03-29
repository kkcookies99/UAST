 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        vector<int> res;
        if(!root)
            return res;
        stack<TreeNode*> stack;
        set<TreeNode*> set;
        stack.push(root);
        while(!stack.empty()){
            auto p = stack.top();
            if(p->left && set.find(p->left)==set.end()){
                stack.push(p->left);
                set.insert(p->left);
                continue;
            }
            stack.pop();
            res.push_back(p->val);
            if(p->right){
                stack.push(p->right);
            }
        }
        return res;
    }
};

