 class Solution {
private:
    vector<int> st;
    void inOrder(TreeNode* root) {
        if(!root) {
            return;
        }
        inOrder(root->left);
        st.push_back(root->val);
        inOrder(root->right);
    }
public:
    bool XXX(TreeNode* root) {
        inOrder(root);
        for(int i = 1; i < st.size(); ++i) {
            if(st[i - 1] == INT_MAX || st[i] == INT_MIN) {
                return false;
            }
            if(st[i] <= st[i - 1]) {
                return false;
            }
        }
        return true;
    }
};

