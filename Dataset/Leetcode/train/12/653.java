 class Solution {
    public String XXX(int num) {
		String[] rome = new String[]{"I","V","X","L","C","D","M"};
		String[] result = new String[4];
		for(int i=0,j=0; i<rome.length; i+=2,j++){
			int pop = num%10;
			if(pop%5==4){
				result[j] = rome[i]+rome[i+1+pop/5];
			}else{
				StringBuilder sb = new StringBuilder();
				if(pop/5==1){
					sb.append(rome[i+1]);
				}
				for(int a=0; a<pop%5; a++){
					sb.append(rome[i]);
				}
				result[j] = sb.toString();
			}
			num /= 10;
		}

		return result[3]+result[2]+result[1]+result[0];
	}
}

