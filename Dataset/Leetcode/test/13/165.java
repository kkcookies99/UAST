class Solution {
    public int XXX(String s) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        String[] ch1 = new String[]{"I","V","X","L","C","D","M"};
        int[] nums = new int[]{1,5,10,50,100,500,1000};
        for(int i = 0;i < 7;i++){
            map.put(ch1[i],nums[i]);
        }
        String s2 = s;
        char[] ch2 = s.toCharArray();
        int res = 0;
        for(int i = 0;i < ch2.length - 1;i++){
            if(ch2[i] == 'I' && ch2[i + 1] == 'V'){
                res += 4;
            }
            if(ch2[i] == 'I' && ch2[i + 1] == 'X'){
                res += 9;
            }
            if(ch2[i] == 'X' && ch2[i + 1] == 'L'){
                res += 40;
            }
            if(ch2[i] == 'X' && ch2[i + 1] == 'C'){
                res += 90;
            }
            if(ch2[i] == 'C' && ch2[i + 1] == 'D'){
                res += 400;
            }
            if(ch2[i] == 'C' && ch2[i + 1] == 'M'){
                res += 900;
            }
            res += map.get(s2.charAt(i));
        }
        return res;
    
    }
}

