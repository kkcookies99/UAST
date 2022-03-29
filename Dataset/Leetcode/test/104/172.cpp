class Solution {
public:
    int count = 0 ;
    int XXX(TreeNode* root) {
        if(root == nullptr) return count ;
        queue<TreeNode*> q ;
        q.push(root) ;
        while(!q.empty()){
            count ++ ;
            for(int i = q.size() ; i ;i --){
                auto node = q.front() ;
                q.pop() ;
                if(node -> left != nullptr) q.push(node -> left) ;
                if(node -> right != nullptr) q.push(node -> right) ;
            }
        }
        return count ;
    }
};


