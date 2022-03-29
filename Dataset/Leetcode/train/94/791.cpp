 class Solution {
public:
    // 递归
    // void XXX(TreeNode* root, vector<int>& res){
    //     if(root == nullptr) return;
    //     if(root->left != nullptr)
    //         XXX(root->left, res);
    //     res.push_back(root->val);
    //     if(root->right != nullptr)
    //         XXX(root->right, res);
    // }
    
    // vector<int> XXX(TreeNode* root) {
    //     vector<int> res;
    //     XXX(root, res);
    //     return res;
    // }

    // 迭代
    vector<int> XXX(TreeNode* root) {
       vector<int> res;
        stack<TreeNode*> st;
        while(root || !st.empty()){
            while(root){
                st.push(root);
                root = root->left;
            }
            root = st.top();
            st.pop();
            res.push_back(root->val);
            root = root->right;
        }
        return res;
    }
};

