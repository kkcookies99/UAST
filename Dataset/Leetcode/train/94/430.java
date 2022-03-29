     public List<Integer> XXX(TreeNode root) {
       List<Integer> resp = new ArrayList<Integer>();
        TreeNode[] stack=new TreeNode[100];
        int index=0;
        
        while(root!=null||index!=0)
        {
            while(root!=null)
            {
                stack[index++]=root;
                root=root.left;
            }
            root=stack[--index];
            resp.add(root.val);
            root=root.right;
        }
        return resp;
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


