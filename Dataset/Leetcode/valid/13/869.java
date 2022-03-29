 class Solution {
    public int XXX(String s) {
        char[] arr = s.toCharArray();
        int[] vrr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'I')
                vrr[i] = 1;
            if (arr[i] == 'V')
                vrr[i] = 5;
            if (arr[i] == 'X')
                vrr[i] = 10;
            if (arr[i] == 'L')
                vrr[i] = 50;
            if (arr[i] == 'C')
                vrr[i] = 100;
            if (arr[i] == 'D')
                vrr[i] = 500;
            if (arr[i] == 'M')
                vrr[i] = 1000;
        }
        int number = 0;
        for(int i = 0; i<vrr.length-1;i++){
            if(vrr[i]>=vrr[i+1]){
                number = number+vrr[i];
            }
            else
                number=number-vrr[i];
        }
        number = number+vrr[vrr.length-1];
        return number;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


