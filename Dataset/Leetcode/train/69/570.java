class Solution {
    public int XXX(int x) {
        double err=1e-7;
        double c=x;
        while(Math.abs(x/c-c)>err){
            c=(c+x/c)/2.0;
        }
        return (int)c;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


