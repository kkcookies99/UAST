 class Solution {
   public int XXX(String s) {
        if(s == null || s == ""){
            return 0;
        }
        int index =0;
        boolean isMinus = false;
        boolean isStartMinus = false; //判断是否开头负数
        boolean isStartChar =false;//判断是否开头整数
        boolean isStartSpace = false;//判断是否开头空格字符
        StringBuilder sb = new StringBuilder();
        //先获取纯数字字符串
        while(index<s.length()){
            char ch = s.charAt(index);
            //出现空白空白字符的情况
            if(ch == ' '){
                if(isStartSpace == false){
                    index++;
                    continue;
                }else{
                    break;
                }
            }
            //出现+-号的情况
            if(ch == '-' || ch == '+'){
            	if(isStartMinus ==false){
                    if(ch == '-'){
                        isMinus =true;
                        index++;
                        isStartMinus= true;
                        isStartSpace = true;
                        continue;
                    }
                    if(ch == '+'){
                        index++;
                        isStartMinus= true;
                        isStartSpace = true;
                        continue;
                    }
                }else{
                    break;
                }
            }
            //出现非数字的情况
            if(ch < 48 || ch> 57){
                if(isStartChar == false){
                    return 0;
                }else{
                    break;
                }
            }
            //开始得到数字的字符串
            sb.append(ch);
            index++;
            isStartMinus= true;
            isStartChar = true;
            isStartSpace = true;
        }
       //获取到的纯数字字符串转整数
       int sum = 0;
        if(isMinus == true){
        	int j = sb.length()-1;
            for(int i=0;i<sb.length();i++){
                int k = sb.charAt(i)-'0';
        		if(sum+(-k*Math.pow(10, j))>=(Integer.MIN_VALUE)) {
              	   sum += (-k*Math.pow(10, j));
              	   j--;
             		}else {
             			return Integer.MIN_VALUE;
             		}
            }
        }else{
        	int j = sb.length()-1;
        	for(int i=0;i<sb.length();i++){
        		int k = sb.charAt(i)-'0';
        		double x =sum+(k*Math.pow(10, j));
        		if(sum+(k*Math.pow(10, j))<=Integer.MAX_VALUE) {
              	   sum += (k*Math.pow(10, j));
              	   j--;
             		}else {
             			return Integer.MAX_VALUE;
             		}
            }
        }
        return sum;
	}
}

