 class Solution {
    private static List<String> globalResult = new ArrayList<String>();

    public List<String> XXX(int n) {
        char[] arr = new char[]{};
        makeBrackets(arr,n*2);
        return globalResult;
    }

    public static void makeBrackets(char[] result,int n){
        if(n != 0){
            if(result.length == 0){
                result = new char[]{'('};
                makeBrackets(result,n-1);
                return;
            }
            char[] resultNew = Arrays.copyOf(result,result.length+1);
            resultNew[result.length] = '(';
            makeBrackets(resultNew,n-1);
            resultNew[result.length] = ')';
            makeBrackets(resultNew,n-1);
        }else{
            if(isValid(result)){
                globalResult.add(new String(result));
            }
        }
    }

    private static boolean isValid(char[] result) {
        int balance = 0;
        for(int i=0;i<result.length;i++){
            if(result[i]=='('){
                balance ++;
            }else if(result[i]==')'){
                balance --;
            }
            if(balance<0){
                return false;
            } 
        }
        return balance == 0;
    }
}

