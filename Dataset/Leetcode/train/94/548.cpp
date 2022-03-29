 class Solution {
public:
    stack<TreeNode*> S;
    vector<int> res;
    vector<int> XXX(TreeNode* root) {
        if(!root)return {};
        TreeNode* p=root;
        while(p||!S.empty())
        {
            for(;p;p=p->left)S.push(p);     // 递归中的左移部分（S.push(p)，这里的p是root左端，相当于root=root->left）
            res.push_back(S.top()->val);    // 递归中的打印部分（S.top相当于递归函数中的root）
            p=S.top()->right;               // 递归中的右移部分（S.top相当于递归函数中的root）
            S.pop();            // 函数return，相当于stack弹出
        }
        return res;
    }
};

