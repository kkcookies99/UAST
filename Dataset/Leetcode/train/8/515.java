 public int XXX(String s) {
  //1。去除前后空格
    String trim = s.trim();
    boolean flag = false;
    if (trim.length() == 0) return 0;
    //2.是否有符号位，如果判断类型并记录 ，然后去除符号位
    if (trim.charAt(0) == '-') {
        flag = true;
        trim = trim.substring(1);
    }else if(trim.charAt(0) == '+')   trim = trim.substring(1);
    //2、查询前多少位是数字，截取下来 0 Unicode 编码为 48 9 Unicode 编码为 57
    //计算最前面0的数量
    int num = 0;
    for (int j = 0 ; j < trim.length(); j++){
        if (trim.charAt(j) == '0') num++;
        else break;
    }
    int i = num;//遍历的指针
    for (;i < trim.length();i++){
        //如果trim.charAt(i)不是数字，停止循环
        if (trim.charAt(i) > 57 || trim.charAt(i) < 48) break;
        if (i - num > 10) break;
    }
    //3.截取是数字的一部分，转换为数字 ，并加上正负号
    //加上判断，可能没有数字
    Long integer = 0l;
    if (i - num != 0) integer = Long.valueOf(trim.substring(num,i ));
    //判断数字是否超过int值返回 超过就返回范围对应的值
    //3.1 判断正负 在根据正负判断边界问题
    if (flag && -integer <= Integer.MIN_VALUE ){
        integer = Long.valueOf(Integer.MIN_VALUE);
        return Integer.valueOf(String.valueOf(integer));
    }
    if (!flag && integer > Integer.MAX_VALUE ) integer = Long.valueOf(Integer.MAX_VALUE);
    Integer integer1 = Integer.valueOf(String.valueOf(integer));

    return flag ? -integer1:integer1;
}
