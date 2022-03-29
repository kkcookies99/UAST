class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<vector<int>> vec;
        if(root==NULL){
            return vec;
        }
        queue<TreeNode*> que;
        que.push(root);
        
        while(!que.empty()){
            int size=que.size();
            vector<int> vec_temp;
            // size为每层的结点数量
            while(size--)
            {
                TreeNode* t = que.front();
                vec_temp.push_back(t->val);
                que.pop();
                
                if(t->left){
                    que.push(t->left);
                }
                 
                if(t->right){
                    que.push(t->right);
                }
            }
            vec.push_back(vec_temp);
        }
        return vec;
    }
};

