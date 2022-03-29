 class Solution {
    private int[] arr = {1,2,3,4,5,6,7,8,9,10,40,50,90,100,400,500,900,1000};
    private Map<Integer,String> map = new HashMap<>(){{
        put(1,"I");put(5,"V");put(10,"X");put(50,"L");put(100,"C");put(500,"D");put(1000,"M");
        put(2,"II");put(3,"III");put(4,"IV");put(6,"VI");put(7,"VII");put(8,"VIII");put(9,"IX");
        put(40,"XL");put(90,"XC");put(400,"CD");put(900,"CM");
    }};
    public String toRome(int num){
        StringBuilder sb = new StringBuilder();
        if(map.containsKey(num)) return sb.append(map.get(num)).reverse().toString();
        while(num!=0){
            for(int i=arr.length-1;i>=0;i--){
                if(num-arr[i]>=0){
                    sb.append(map.get(arr[i]));
                    num -= arr[i];
                    break;
                } 
            }
        }
        return sb.reverse().toString();
    }
    public String XXX(int num) {
        StringBuilder sb = new StringBuilder();
        int times = 1;
        while(num!=0){
            int bit = num % 10;//当前位数
            num /=10;
            if(bit!=0)
                sb.append(toRome(bit*times));
            times *= 10;
        }
        return sb.reverse().toString();
    }
}

