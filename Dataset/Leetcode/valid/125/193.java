 class Solution {
    public boolean XXX(String s) {

        if(s.length() == 1)return true;
        //统一大小写
        //都转小写
        s = s.toLowerCase();
        //这是去除头尾空格
//        s = s.trim();
        //这是将所有空格替换成空字符
        s = s.replace(" ", "");

        int left = 0, right = s.length() - 1;
        while(left <= right){
            //碰到符号怎么办
            //跳过
            while(left <= right && !Character.isLetterOrDigit(s.charAt(left)))left++;
            while(left <= right && !Character.isLetterOrDigit(s.charAt(right)))right--;
            if(left <= right && s.charAt(left) != s.charAt(right))return false;
            left++;
            right--;
        }
        return true;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


