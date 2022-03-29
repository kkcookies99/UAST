 class Solution {
    public String XXX(String a, String b) {
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();
        int up = 0, i = 0;
        StringBuffer sum = new StringBuffer();
        while(i < arr1.length || i < arr2.length){
            //System.out.println("i = " + i + " " + " up = " + up);
            if(up == 1 && i < arr1.length && i < arr2.length){
                int temp = arr1[arr1.length - i - 1] - '0' + arr2[arr2.length - i - 1] - '0' + 1;
                if(temp == 3){
                    up = 1;
                    sum.append("1");
                }else if(temp == 2){
                    up = 1;
                    sum.append("0");
                }else if(temp == 1){
                    up = 0;
                    sum.append("1");
                }else{
                    up = 0;
                    sum.append("0");
                }
            }else if(up == 1 && i < arr1.length && i >= arr2.length){
                int temp = arr1[arr1.length - i - 1] - '0' + 1;
                //System.out.println("temp = " + temp);
                if(temp == 2){
                    up = 1;
                    sum.append("0");
                }else if(temp == 1){
                    up = 0;
                    sum.append("1");
                }else{
                    up = 0;
                    sum.append("0");
                }               
            }else if(up == 1 && i >= arr1.length && i < arr2.length){
                int temp = arr2[arr2.length - i - 1] - '0' + 1;
                if(temp == 2){
                    up = 1;
                    sum.append("0");
                }else if(temp == 1){
                    up = 0;
                    sum.append("1");
                }else{
                    up = 0;
                    sum.append("0");
                }               
            }else if(up == 0 && i < arr1.length && i < arr2.length){
                int temp = arr1[arr1.length - i - 1] - '0' + arr2[arr2.length - i - 1] - '0';
                //System.out.println(temp);
                if(temp == 2){
                    up = 1;
                    sum.append("0");
                }else if(temp == 1){
                    up = 0;
                    sum.append("1");
                }else{
                    up = 0;
                    sum.append("0");
                }
            }else if(up == 0 && i < arr1.length && i >= arr2.length){
                int temp = arr1[arr1.length - i - 1] - '0';
                if(temp == 2){
                    up = 1;
                    sum.append("0");
                }else if(temp == 1){
                    up = 0;
                    sum.append("1");
                }else{
                    up = 0;
                    sum.append("0");
                }               
            }else if(up == 0 && i >= arr1.length && i < arr2.length){
                int temp = arr2[arr2.length - i - 1] - '0';
                if(temp == 2){
                    up = 1;
                    sum.append("0");
                }else if(temp == 1){
                    up = 0;
                    sum.append("1");
                }else{
                    up = 0;
                    sum.append("0");
                }               
            }
            i++;
        }
        if(up == 1){
            sum.append("1");
        }
        sum.reverse();
        //System.out.println(sum);
        return sum.toString(); 
    }
}

