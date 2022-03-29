class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<vector<int>>rs;
        queue<TreeNode *>myqueue;
        if(root){
            myqueue.push(root);
            while(!myqueue.empty()){
                vector<int>item;
                int len=myqueue.size();
                for(int i=0;i<len;++i){
                    TreeNode *temp=myqueue.front();
                    item.push_back(temp->val);
                    if(temp->left)myqueue.push(temp->left);
                    if(temp->right)myqueue.push(temp->right);
                     myqueue.pop();
                }
                rs.push_back(item);
            }
        }
        return rs;
    }
};

