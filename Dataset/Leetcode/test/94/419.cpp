 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        TreeNode *node=root;
        vector<int> temp;
        stack<TreeNode *> s_node;
        //节点非空或者栈内剩余元素就一直循环
        while(node!=nullptr||!s_node.empty())
        {   //节点非空，就先压栈，直至最左的节点
            while(node!=nullptr){
                s_node.push(node);
                node=node->left;
            }
            //从栈内依次输出节点
            if(!s_node.empty())
            {
                temp.push_back(s_node.top()->val);
                node=s_node.top()->right;
                s_node.pop();
            }
        }
        return temp;
    }
};

