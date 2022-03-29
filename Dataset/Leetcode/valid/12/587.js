 var XXX = function(num) {
 let roma='',base=[1000, 500, 100, 50, 10, 5, 1],symbol=['M','D','C','L','X','V','I'],wrong=['DCCCC', 'CCCC', 'LXXXX', 'XXXX', 'VIIII', 'IIII'],
        right=['CM', 'CD', 'XC', 'XL', 'IX', 'IV']
        base.forEach((e,i)=>{
            if(Math.floor(num/e)){
                roma+=symbol[i].repeat(Math.floor(num/e))
                num%=e
            }
        })
        wrong.forEach((e,i)=>{
            roma=roma.replaceAll(e,right[i])
        })
        return roma
};
```js

