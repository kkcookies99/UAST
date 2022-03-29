 class Solution {
    public String XXX(int num) {
        StringBuilder sb=new StringBuilder();
        char arr[][]={
                {'I','V'},
                {'X','L'},
                {'C','D'},
                {'M'},

        };
        while(num!=0){
            int a=num%10;
            sb.append(a);
            num/=10;
        }
        StringBuilder result=new StringBuilder();
        for (int i = sb.length()-1; i >= 0; i--) {
            int b=sb.charAt(i)-'0';
            if (b<4){//0<=b<4
                for (int j = 0; j < b; j++) {
                    result.append(arr[i][0]);
                }
            }else if (b==4){
                result.append(arr[i][0]).append(arr[i][1]);
            }else if (b<9){
                result.append(arr[i][1]);
                for (int j = 0; j < b-5; j++) {
                    result.append(arr[i][0]);
                }
            }else{
                result.append(arr[i][0]).append(arr[i+1][0]);
            }
        }
        return result.toString();
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


