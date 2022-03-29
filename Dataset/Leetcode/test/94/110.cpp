 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        stack<TreeNode* > st;
        vector<int> res;
        TreeNode *p=root;
        while(!st.empty() || p){ 
            while(p){
                st.push(p);
                p=p->left;
            }
            p=st.top();
            st.pop();
            res.push_back(p->val);
            p=p->right;            
        }
        return res;
    }
};

