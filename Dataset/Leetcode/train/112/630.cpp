 class Solution {
public:   
    bool XXX(TreeNode* root, int sum) {      
        return travel(root,0,sum);
    }

    bool travel(TreeNode* root,int res,int &sum){
        if(root==nullptr){
            return false;
        }
        res+=root->val; 
        if(root->left==nullptr && root->right==nullptr){ 
            if(res==sum){
                return true;
            }          
            return false;          
        }              
        return travel(root->left,res,sum) || travel(root->right,res,sum);        
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


