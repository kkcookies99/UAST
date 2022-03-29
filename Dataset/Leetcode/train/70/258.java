class Solution {
    public int XXX(int n) {
        int[] arr=new int[n+10];
        arr[0]=0;
        arr[1]=1;
        arr[2]=2;
        for(int i=3;i<=n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
    return arr[n];

    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


