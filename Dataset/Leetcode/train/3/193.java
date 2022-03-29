 class Solution {
    public int XXX(String s) {
        //1、一次增加一个字母
        //2、将其存储在StringBuffer表中，记录最大表长
        //3、每次新增一个字母都与表中的比较，如果有相同则将原表中第一个字母删除
        //4、直到没有相同的字母，将最新字母增加到表中
        Integer maxLength = 0;  //记录最大无重复字母数
        StringBuffer pud = new StringBuffer();      //存储比较的单个字母
        StringBuffer buffer = new StringBuffer();   //存储无重复字母表
        if (!s.isEmpty()){      //判断表是否为空，不为空则进行比较
            buffer.append(s.charAt(0));     //增加第一个字母到比较表中
            for (int i = 1; i < s.length(); i++) {  //遍历整个字符串
                pud.append(s.charAt(i));
                if (!buffer.toString().contains(pud)){          //判断是否有重复字母
                    buffer.append(pud);     //添加新字母到无重复表中
                }else {
                    buffer.delete(0,1);     //删除表中第一字母，下面同意
                    while (buffer.toString().contains(pud)){    //重复判断，删除，直到无重复字母
                        buffer.delete(0,1);
                    }
                    buffer.append(pud);     //添加新字母到无重复表中
                }

                pud.delete(0,1);            //格式化比较表

                if (buffer.length() > maxLength)    //刷新最大数量
                    maxLength = buffer.length();
            }
        }
        return maxLength;
    }
}

