 class Solution {
public:
  vector<int> XXX(TreeNode* root) {
    //迭代版中序遍历
    vector<TreeNode*> aux;
    vector<int> res;
    if(!root){ return res; }

    TreeNode* ptr = root;
    while(ptr||!aux.empty()){
      while(ptr){
        aux.push_back(ptr);
        ptr = ptr->left;
      }
      if(aux.empty()){ break; }

      ptr = aux.back();
      res.push_back(ptr->val);
      ptr = ptr->right;
      aux.pop_back();
    }

    return res;       
  }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


