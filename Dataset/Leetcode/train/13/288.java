class Solution {
    public int XXX(String s) {
        //把string放进array里//
        char[] array=s.toCharArray();
        //建设map,把对应的字符和值放进去//
        Map<Character, Integer> m1 = new HashMap<Character, Integer>();
        m1.put('M',1000);
        m1.put('D',500);
        m1.put('C',100);
        m1.put('L',50);
        m1.put('X',10);
        m1.put('V',5);
        m1.put('I',1);
        //最终的结果//
        int result=0;
        for(int i=0; i<array.length; i++){
            //如果到了最后一位直接加//
            if(i==array.length-1){
                //用map的get函数得到当前字符对应的数值//
               result +=  m1.get(array[i]); 
            }
            //在array 0到倒数第二位//
            else{
                //如果当前的值比右边的值小, 那就先减去当前的值//
                //如IV, 因为1<5, 所以先0-1, 然后-1+5//
                if(m1.get(array[i])<m1.get(array[i+1])){
                    result -=  m1.get(array[i]);
                }
                //如果当前的值大于等于右边的值, 就直接加上当前的值//
                else{
                    result +=  m1.get(array[i]);
                }
            }     
        }
        return result;
    }
} 


