 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        stack<TreeNode*> a;
        vector<int> v;
        while(root||!a.empty()){//判断当前中节点和栈是否都为空
            while(root){//将中节点入栈，以及把中节点的左子节点变为中节点
                a.push(root);
                root=root->left;
            } 
            root=a.top();//左子节点为空则倒回上一步，并将中节点出栈
            a.pop();
            v.push_back(root->val);
            root=root->right; //将右子节点变为中节点并继续迭代
        }
        return v;
    }
};

