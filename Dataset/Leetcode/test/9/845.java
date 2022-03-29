 class Solution {
    public boolean XXX(int x) {
      //将整数类型的数字转字符串数组
      String str=String.valueOf(x);
      //使用反转后的元素与未反转的元素进行对比！
      StringBuilder sb=new StringBuilder(str);
      String result=sb.reverse().toString();
      return str.equals(result);
    }
}

