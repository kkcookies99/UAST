 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        vector<int> ret;
        stack<TreeNode*> st;
        while(!st.empty() || root){
            while(root){
                st.push(root);
                root = root->left;
            }
            ret.push_back(st.top()->val);
            root = st.top()->right;
            st.pop();
        }
            return ret;
    }
};

