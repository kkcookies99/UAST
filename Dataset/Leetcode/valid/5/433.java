     public String XXX(String s) {
        if (s == null || s.length() <= 0){
            return "";
        }
        int temp = 1;
        String str = "";
        char[] arr = s.toCharArray();
        int len = arr.length;
        for (int i = 0; i < len; i ++){
            for (int j = i + 1; j < len; j ++){
                if (arr[j] == arr[i]){
                    if (boolPalindrome(s.substring(i, j + 1))){
                        if ((j + 1 - i) > temp){
                            temp = j - i + 1; // 存储回文字符长度
                            str = s.substring(i, j + 1); // 存储回文
                        }
                    }
                }
            }
        }
        if (str == ""){
            return s.substring(0, 1);
        }
        return str;
    }

    public boolean boolPalindrome(String s){ // 判断是否是回文
        if (s.length() <= 3){
            return true;
        }
        char[] arr = s.toCharArray();
        int len = arr.length;
        for (int i = 0; i < len / 2; i ++){
            if (arr[i] != arr[len - i -1]){
                return false;
            }
        }
        return true;
    }

