class Solution {
public:
    int XXX(TreeNode* root) {
        if(root==NULL) return 0;
        //BFS
        queue<TreeNode*> que;
        que.push(root);
        int count = 1;
        while(!que.empty()){
            int n = que.size();
           // cout<<"n = "<<n<<endl;
            for(int i=0;i<n;i++){
                TreeNode* node = que.front();
                que.pop();
                if(node->left==NULL&&node->right==NULL) {
                    //cout<<"val = "<<node->val<<endl;
                    return count;
                }
                if(node->left!=NULL){
                    que.push(node->left);
                }
                if(node->right!=NULL){
                    que.push(node->right);
                }
            }
            count++;
        }
        return 0;
    }
};

