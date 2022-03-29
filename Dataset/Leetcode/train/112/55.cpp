class Solution {
public:
    bool XXX(TreeNode* root, int targetSum) {

        //1.自己做的bfs
        //  if(!root)
        //  return false;
        //  queue<TreeNode*> q;
        //  q.push(root);
        //  while(!q.empty()){
        //       int s=q.size();
        //       for(int i=0;i<s;i++){
        //           auto node=q.front();
        //           int temp=node->val;
        //           q.pop();
        //           if(node->left){
        //              node->left->val+=temp;
        //              q.push(node->left);
        //           }
        //           if(node->right){
        //              node->right->val+=temp;
        //              q.push(node->right);
        //           }
        //           if(!node->left&&!node->right&&node->val==targetSum){
        //               return true;
        //           }
        //       }
        //  }
        //  return false;


         // 2.官方的递归，相加转换成递减！！！！！
         if (root == nullptr) {
            return false;
        }
        if (root->left == nullptr && root->right == nullptr) {
            return targetSum == root->val;
        }
        return XXX(root->left, targetSum - root->val) ||
               XXX(root->right, targetSum - root->val);
        
    }
};

