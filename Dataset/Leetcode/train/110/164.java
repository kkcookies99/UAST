class Solution {
    public boolean XXX(TreeNode root) {
            //最终要返回是否平衡 判断过程也需知子节点是否平衡
            //判断过程要返回长度 并取大的值加一
            //递归要一视同仁 节点都一样 对下方左右子节点的要求自己也要满足
            return process(root).isBanlanced;
        }

        //定义一个Info类 包含这两个信息
        class Info {
            boolean isBanlanced;
            int height;

            public Info(boolean isBanlanced, int height) {
                this.isBanlanced = isBanlanced;
                this.height = height;
            }
        }

        //定义一个process方法传root返回Info
        Info process(TreeNode root) {
            //如果root=null 是true 返回new Info true 0
            if (root == null) {
                return new Info(true, 0);
            }
            Info leftInfo = process(root.left);
            Info rightInfo = process(root.right);
            //否则需要判断 获取他的左右子树的值 然后比较绝对值是否小于2 并取大的值加一
            boolean isBanlanced = leftInfo.isBanlanced && rightInfo.isBanlanced
                    && Math.abs(leftInfo.height - rightInfo.height) < 2;
            return new Info(isBanlanced, Math.max(leftInfo.height, rightInfo.height) + 1);
        }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


