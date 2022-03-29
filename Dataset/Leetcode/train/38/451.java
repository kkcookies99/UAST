 class Solution {
    public String XXX(int n) {
        //将n-1的数拆成由相同连续数字组成的组，分别描述，再相连
        StringBuffer pre = new StringBuffer("1");//上一项
        if(n == 1)
            return pre.toString();
        for(int i = 1; i < n; i++){
            StringBuffer now = new StringBuffer();//当前项 
            int front = 0;//记录相同连续数字头部的指针
            int rear = 0;//尾指针
            //遍历整个字符串
            while(rear < pre.length()){
                //对相同元素进行遍历
                while(rear + 1 < pre.length() && pre.charAt(rear) == pre.charAt(rear + 1)){
                    ++rear;
                }
                now.append((rear - front + 1) + "" + pre.charAt(front));//个数+数值
                //移动指针至下一个元素
                ++rear;
                front = rear;
            }
            //保存至pre
            pre = now;
        }


        return pre.toString(); 

    }
}

