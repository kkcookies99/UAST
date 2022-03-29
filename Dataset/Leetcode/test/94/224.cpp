 class Solution {
public:
    //非递归：
    vector<int> XXX(TreeNode* root) {
        vector<int> in;
        if(root==NULL) return in;
        stack<TreeNode*> leftRoot;//辅助栈；
        TreeNode *pt,*leftOut;//pt遍历指针，leftOut处理边界情况
        pt=root;
        while(pt!=NULL){
            leftRoot.push(pt);
            pt=pt->left;
        }
        while(!leftRoot.empty()){
            leftOut=leftRoot.top();
            leftRoot.pop();
            in.push_back(leftOut->val);
            if(leftOut->right!=NULL){
                pt=leftOut->right;
                while(pt!=NULL){
                    leftRoot.push(pt);
                    pt=pt->left;
                }
            }
        }
        return in;
    }
};

