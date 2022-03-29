class Solution {
public:
    int mark = 1;
    bool XXX(TreeNode* root, int sum) {
        queue<int> que;
        function(root,0,sum,que);
        return (mark==0)?true:false;
    }
    void function(TreeNode* root,int Cur_sum,int sum,queue<int> que)
    {
        
        while(Cur_sum > sum)
        {
            Cur_sum-=que.front();
            que.pop();
        }
        if(Cur_sum == sum)
        {
            mark=0;
            return;
        }
        if(!root)
        return;
        Cur_sum+=root->val;
        que.push(root->val);
        function(root->left,Cur_sum,sum,que);
        function(root->right,Cur_sum,sum,que);
    }
};

