 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        stack<TreeNode*> s;
        TreeNode * p = root;
        vector<int> ret;

        while(!s.empty()||p!=nullptr){
            if(p!=nullptr) {
                s.push(p);
                p = p->left;
            }
            else{
                p = s.top();
                s.pop();
                ret.push_back(p->val);
                p = p->right;
            }
        }
        return ret;
    }
};

