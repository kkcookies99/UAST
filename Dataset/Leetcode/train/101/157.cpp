 class Solution {
public:
    bool XXX(TreeNode* root) {
        //判断是不是一个满二叉树且左右元素对称
        if(!root)
            return true;
        stack<TreeNode *>sleft;
        stack<TreeNode *>sright;
        vector<int>leftnode;
        vector<int>rightnode;
        sleft.push(root->left);
        sright.push(root->right);
        //对root的左子树采取根右左的遍历，遇到空结点补10
        while(!sleft.empty()){
            TreeNode * node=sleft.top();
            sleft.pop();
            if(!node){
                leftnode.push_back(10);
                continue;
            }      
            leftnode.push_back(node->val);
            sleft.push(node->left);
            sleft.push(node->right);   
        }
        //对root的右子树采取根左右的遍历，遇到空结点补10
        while(!sright.empty()){
            TreeNode * node=sright.top();
            sright.pop();
            if(!node){
                 rightnode.push_back(10);
                continue;
            }         
            rightnode.push_back(node->val);
            sright.push(node->right);
            sright.push(node->left);
               
        }
        //如果左右两个子树结点数目不相同，则必定不对称
        if(leftnode.size()!=rightnode.size())
            return false;
        //如果左右两个字数按照上诉遍历出来的结果不相同，则一定不对称
        for(int i=0;i<leftnode.size();i++){
            if(leftnode[i]!=rightnode[i])
                return false;
        }
        //如都满足，则证明对此
        return true;
    }
    
};

