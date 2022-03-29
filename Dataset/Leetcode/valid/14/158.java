 class Solution {
    public String XXX(String[] strs) {
    	if(strs[0].length() == 0){
    		return "";
    	}
    	int min = 100;
    	for (int i = 0; i < strs.length; i++) {
			if(strs[i].length() < min){
				min = strs[i].length();
			}
		}
        int temp = 0;
        int num = 0;
        int a = 0;
        char c = strs[0].charAt(temp);;
        while(temp < strs[0].length() && a!=1 && temp < min){
        	c = strs[0].charAt(temp);
        	for(int i = 0;i < strs.length;i++){
        		if(c == strs[i].charAt(temp)){//如果第temp个字符每到一个字符串能对应就让num+1
        			num++;
        		}else{
        			a = 1;
        			break;
        		}
        		if(num == strs.length){//如果num的数量是字符串的数量，那么就让指针+1
        			temp++;
        			num = 0;
        		}
        	}
        }
        if(temp == 1){
        	return strs[0].substring(0, temp);
        }
        return temp == 0 ? "" : strs[0].substring(0, temp);
    }
}

