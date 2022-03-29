class Solution {
public:
    bool flags = true;
    bool XXX(TreeNode* root) {
        DFS(root,flags);
        return flags;
        
    }
    int DFS(TreeNode* root, bool &flags){
        if(flags == false || root == NULL)
            return 0;
        int left_h = DFS(root->left,flags);
        int right_h = DFS(root->right,flags);
        if(abs(left_h-right_h)>1)
            flags = false;
        //cout<<"left = "<<left_h<<" right = "<<right_h<<" root_h = "<<max(left_h,right_h)+1<<endl;
        return max(left_h,right_h)+1;
    }

};

