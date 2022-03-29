 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
     stack<TreeNode*>st;
     vector<int>res;
     if(!root)return vector<int>{};
     while(root||!st.empty()){
         while(root){
             st.push(root);
             root=root->left;
         }//遍历次序依然是根左右，处理次序不同罢了
         root=st.top();
         st.pop();
         res.push_back(root->val);
         root=root->right;
         
     }
     return res;
    }
};

