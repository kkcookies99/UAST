var XXX = function(n) {
    let arr=new Array(n+1).fill(null);
    function find(n){
        if(n==1||n==2){
            arr[n]=n;
            return n
        }
        if(arr[n]){
            return arr[n]
        }
        arr[n]=find(n-1)+find(n-2)
        return find(n-1)+find(n-2);      
    }
    return find(n)
};

