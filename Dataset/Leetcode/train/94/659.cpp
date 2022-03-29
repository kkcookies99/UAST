 class Solution {
public:
    void goAlongLeftBranch(TreeNode* node,stack<TreeNode*>& s)
    {
        while(node) //不是node->left，因为要把最后一个节点也放进来
        {
            s.push(node);
            node=node->left;
        }
    }

    vector<int> XXX(TreeNode* root) {
        //中序的迭代版本
        stack<TreeNode*> s;
        TreeNode* x=root;
        vector<int> inorder;

        while(true)
        {
            goAlongLeftBranch(x,s);
            if(s.empty())break;
            x=s.top();
            s.pop();
            inorder.push_back(x->val);
            x=x->right;
        }

        return inorder;    
        
    }
};

