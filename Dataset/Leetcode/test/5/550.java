 class Solution {
    public String XXX(String s) {
        int maxLen = 0;
        String longest = "";
        for(int i=0; i< s.length(); i++){
            for(int j=s.length()-1; j>=i; j--){
                if(maxLen > j-i){
                    break;
                }
                if(s.charAt(i) != s.charAt(j)){
//                    System.out.println(s.charAt(i) + ":" + s.charAt(j));
                    continue;
                }
                String test = s.substring(i,j+1);
//                System.out.println("substr:"+ test+"  i:"+i + " j:"+j);
                if(isPalindrome(test.toCharArray())){
                    maxLen = test.length();
                    longest = test;
//                    System.out.println("longest:"+longest);
                }

            }
        }
        return longest;
    }

    public Boolean isPalindrome(char[] sequence){
        int size = sequence.length;
        for(int i=0; i<size/2; i++){
            if(sequence[i] != sequence[size-1-i]){
                return false;
            }
        }
        return true;
    }
}



