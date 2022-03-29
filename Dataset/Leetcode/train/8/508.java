  public int XXX(String s) {
       // 合法性校验
       if(s ==null || s.length() == 0 || "".equals(s))
        return 0;
       // 处理每个字符
      char[] charArray = s.toCharArray();
      int result = 0;
      Boolean just = true;      
      // 有合法数据了
      boolean falg = false;
      for(char item: charArray){
          if (!falg && ' ' == item ) continue;
          if(item <58 && item > 47){
             //合法数据
              falg = true;
              int cruuent = item - 48;
              if(just){
                  // 判断是否超出最大范围
                  if((Integer.MAX_VALUE - cruuent)/10 < result) return Integer.MAX_VALUE;
                  else
                   result = result *10 + cruuent;
              }else{
                  // 判断是否超出最小范围
                  if( (Integer.MIN_VALUE + cruuent)/10 > result ) return Integer.MIN_VALUE;
                  else 
                    result = result*10 - cruuent; 
              }
          }else if(!falg && ('-' == item || '+' == item)){
            falg = true;
            if('-' == item) just = false;
          }else{
             break; 
          }
        }
      return result;
     }

