class Solution {
public:
    int XXX(TreeNode* root) {
        if(root == NULL) return 0;
        queue<TreeNode*>q;
        queue<int>record;
        q.push(root);
        record.push(1);
        while(1){
            TreeNode* id = q.front();
            int num = record.front();
            q.pop();
            record.pop();
            if(id->left == NULL && id -> right == NULL) return num;
            if(id->left != NULL){
                q.push(id->left);
                record.push(num+1);
            }
            if(id->right != NULL){
                q.push(id->right);
                record.push(num+1);
            }
        }
        return -1;
    }
};

