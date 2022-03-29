 var XXX = function(a, b) {
        let upper = false;
        let maxLen = Math.max(a.length, b.length);
        a = '0'.repeat(maxLen - a.length) + a;
        b = '0'.repeat(maxLen - b.length) + b;

        let currentIndex = maxLen - 1;
        let list = [];
        while(currentIndex>=0){
            let add = Number(a[currentIndex]) + Number(b[currentIndex])+~~upper;
            upper = add>1;
            add = add%2;
            list.unshift(add);
            currentIndex--;
            if(currentIndex<0 && upper){
                list.unshift(1)
            }
        }
        return list.join('')
};

