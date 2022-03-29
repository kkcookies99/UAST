class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<vector<int>> result;
        vector<int> son;
        if( root == NULL) return result;
        int front = -1;
        int rear = -1;
        int last = 0;
        queue<TreeNode*> q;
        q.push(root);
        rear++;
        while(front < rear){
            TreeNode * temp ;
            temp = q.front();
            q.pop();
            front++;
            son.push_back(temp->val);
            if(temp->left){
                q.push(temp->left);
                rear++;
            }
            if(temp->right){
                q.push(temp->right);
                rear++;
            }
            if(front == last){
                result.push_back(son);
                son.clear();
                last = rear;
            }
            
        }
             return result;
    }
};

