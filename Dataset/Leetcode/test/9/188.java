public boolean XXX(int x) {
    //1、小于0的数不是回文数
    if(x<0){
        return false;
    }
    //2、10以内的数都是回文数
    if(x<10){
        return true;
    }
    int size = stringSize(x);
    //是否奇数
    Boolean isOdd  = size%2==1;
    int reversed = 0;
    for (int i = 0; i < size/2 ; i++) {
        reversed += x%10;
        reversed*=10;
        x/=10;
    }
    //奇数 x需要再除以10
    if (isOdd) {
        x/=10;
    }
    reversed/=10;
    return reversed == x;
}

final static int [] sizeTable = { 9, 99, 999, 9999, 99999, 999999, 9999999,
        99999999, 999999999, Integer.MAX_VALUE };

// Requires positive x
static int stringSize(int x) {
    for (int i=0; ; i++){
        if (x <= sizeTable[i]){
            return i+1;
        }
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

