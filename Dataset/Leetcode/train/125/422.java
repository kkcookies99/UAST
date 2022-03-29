 class Solution {
    public boolean XXX(String s) {
        //思路：先将s转成StringBuffer,然后遍历去掉空格，逗号，冒号等，只保留字母和数字，然后双指针，
        //分别从前向后和从后向前遍历
        StringBuffer sb = new StringBuffer();
        for(int i = 0 ; i < s.length() ; i++){
            if((s.charAt(i)>='0' && s.charAt(i)<='9') || (s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='a' && s.charAt(i)<='z')){
                sb.append(s.charAt(i));
            }
        }
        StringBuffer sb1 = new StringBuffer();
        //得到只保留数字和字母的字符串sb
        //通过评论知道0+32=P，会影响之后判断,因此直接将所有大写字母全转换为小写字母，方便之后判断
        for(int i = 0 ; i < sb.toString().length() ; i++){
            if(sb.toString().charAt(i)>='A' && sb.toString().charAt(i)<='Z'){
                sb1.append((char)(sb.toString().charAt(i)+32));
            }else{
                sb1.append(sb.toString().charAt(i));
            }
        }
        //得到全是小写字母和数字的字符串，双指针遍历前后是否相等
        //System.out.print(sb1);
        //return true;
        int p = 0;
        int q = sb1.toString().length() - 1;
        while(p < q){
            if(sb1.toString().charAt(p) != sb1.toString().charAt(q)){
                //前后不相等
                return false;
            }

            p++;
            q--;
        }
        return true;
    }
}








