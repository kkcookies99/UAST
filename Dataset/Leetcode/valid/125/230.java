 public boolean XXX(String s) {
        // 空字符串为有效回文串
        if(s.length() == 0){
            return true;
        }
        // 字母全部转为小写
        s = s.toLowerCase();
        // 双指针
        int left = 0;
        int right = s.length()-1;
        // 判断左、右字符是否均符号要求(字母和数字)
        boolean flag = true;
        // 指针碰撞
        while(left < right){
            // 左、右字符转换为10进制
            int l = s.charAt(left);
            int r = s.charAt(right);
            // 左字符不符合要求(字母和数字)
            if(l < 48 || (l > 57 && l < 97) || l > 122){
                ++left;
                flag = false;
            }
            // 右字符不符合要求(字母和数字)
            if(r < 48 || (r > 57 && r < 97) || r > 122){
                --right;
                flag = false;
            }
            // 左、右字符均符合要求(字母和数字)
            if(flag){
                // 左、右字符不相同则结束(说明不是回文串)
                if(l != r){
                    return false;
                }
                // 左、右字符相同,则左指针右移、右指针左移
                ++left;
                --right;
            }
            flag = true;
        }
        // 循环能够走完则为回文串
        return true;
    }

