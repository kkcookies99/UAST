public String XXX(int n) {
        String str = new String();
        for (int i = 1; i < n+1; i++) {
            StringBuffer  sub = new StringBuffer();
            //从1开始初始化
            if(i==1){
                str+="1";
            }else{
                //设置计数器
                int count = 0;
                //设置临时变量，负责与新的字符串逐位比较，相同则计数器加一
                char temp = str.charAt(0);
                for (int j = 0; j < str.length(); j++) {
                        if(str.charAt(j)==temp){
                            count++;
                        }
                        else{
                            //不相同时，先把之前算好的子字符串拼接，然后重置临时变量，计数器从1开始计算
                            sub.append(count).append(temp);
                            temp = str.charAt(j);
                            count = 1;
                        }
                }
                sub.append(count).append(temp);
                str = sub.toString();
            }
        }
        return str;
    }

