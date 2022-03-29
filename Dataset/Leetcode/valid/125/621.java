 class Solution {
    public boolean XXX(String s) {
        int left = 0;
	        int right = s.length()-1;
	        
	        while(left < right){
	        	 int leftChar = s.charAt(left);
		         int rightChar = s.charAt(right);
	            while(left < right && (leftChar < '0' || leftChar > '9') && (leftChar < 'a' || leftChar > 'z') && (leftChar<'A' || leftChar > 'Z')){
	                left++;
                     leftChar = s.charAt(left);
	            }
	            while(left < right && (rightChar < '0' || rightChar > '9') && (rightChar < 'a' || rightChar > 'z') && (rightChar <'A' || rightChar > 'Z')){
	                right--;
                    rightChar = s.charAt(right);
	            }

	            if(leftChar >= 'A' && leftChar <= 'Z') leftChar = leftChar - 'A' + 'a';
	            if(rightChar >= 'A' && rightChar <= 'Z') rightChar = rightChar - 'A' + 'a';
	            if(leftChar != rightChar) return false;
	            left++;
	            right--;
	        }
	        return true;
    }
}

