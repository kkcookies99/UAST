 class Solution {
public:
    bool XXX(TreeNode* p, TreeNode* q) {
       if(!p&&!q)return true;
       if(!p&&q||p&&!q)return false;
       queue<TreeNode*>q1,q2;
       q1.push(p);
       q2.push(q);
       while(!q1.empty()&&!q2.empty()){
           TreeNode* node1=q1.front();
           TreeNode* node2=q2.front();
           q1.pop(),q2.pop();
           if(!node1&&!node2)continue;
           else if(!node1&&node2||node1&&!node2||(node1->val!=node2->val))return false;
           q1.push(node1->left);
           q2.push(node2->left);
           q1.push(node1->right);
           q2.push(node2->right);
       }
       return true;
    }
};

