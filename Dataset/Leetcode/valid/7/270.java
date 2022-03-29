 public int XXX(int x) {
        if(x > (Math.pow(2, 31) - 1) || x < -Math.pow(2, 31)) {  //判断是否超出最大 最小范围
		return 0;
		}
	String valueOf = String.valueOf(x);
          //判断负数的情况
	if(valueOf.contains("-")) { 
	StringBuilder sBuilders=new StringBuilder(valueOf.substring(valueOf.indexOf("-")+1).toString());
	Integer valueOf3=null;
	try {
	     valueOf3 = Integer.parseInt("-"+sBuilders.XXX().toString());
	     } catch (Exception e) {
		 return 0;     //溢出就会抛异常  这里抛了异常说明溢出  就返回一个0
	    }
		return valueOf3;
	   }
           //判断正数的情况
          StringBuilder sBuilder=new StringBuilder(valueOf);
	  StringBuilder XXX = sBuilder.XXX();
	 Integer valueOf2 = null;
	 try {
		valueOf2 = Integer.parseInt(XXX.toString());
	} catch (Exception e) {
		return 0;     //溢出就会抛异常  这里抛了异常说明溢出  就返回一个0
	}
	return valueOf2;
    }

