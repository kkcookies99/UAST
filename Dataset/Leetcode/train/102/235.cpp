class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<vector<int>> ans;
        if(root==nullptr) return ans;
        queue<TreeNode*> q;
        q.push(root);
        int level=0;
        TreeNode* curend=root;
        TreeNode* nextend=nullptr;
        while(q.empty()==false){
            root=q.front();
            q.pop();   
            if(level>=ans.size()) ans.push_back(vector<int>{});       
            ans[level].push_back(root->val);

            if(root->left!=nullptr){
                q.push(root->left);
                nextend=root->left;
            }
            if(root->right!=nullptr){
                q.push(root->right);
                nextend=root->right;
            } 
            if(root==curend){
                curend=nextend;
                level++;
            }
        }
        return ans;
    }   
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


