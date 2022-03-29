 class Solution {
    public int XXX(String str) {
        if(str == null || str.length() == 0) return 0;
        double rs = 0;
        boolean isStart = true;
        boolean posi = true;
        char[] chs = str.toCharArray();
        for(int i = 0, len = chs.length; i < len; i++){
        	char ch = chs[i];
        	if(ch != ' '){//非空字符处理
        		if(isStart){//第一个字符处理
        			isStart = false;
        			if(ch == '-'){
        				posi = false;
        			}else if(ch == '+'){
        				continue;
        			}else if(ch >= '0' && ch <= '9'){
        				rs = rs*10 + (ch - '0');
        			}else return 0;
        		}else{//非第一个字符处理
        			if(ch >= '0' && ch <= '9'){
        				rs = rs*10 + (ch - '0');
        			}else break;
        		}
        	}else{//空字符处理
        		if(isStart) continue; //若未找到第一个非空字符时, 出现空格字符, 继续循环
        		else break; //若找到第一个非空字符后, 出现空格字符, 停止循环
        	}
        }
        
        //为结果加上符号
        rs = !posi? -rs : rs;
        
        //若结果 rs 超过 32 位有符号整数范围
        if(rs > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(rs < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        
        return (int) rs;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


