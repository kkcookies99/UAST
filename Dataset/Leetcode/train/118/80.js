  var XXX = function(numRows) {
       if(numRows===1){
            return [[1]]
        }else if(numRows===2){
            return [[1],[1,1]]
        }else{
            let arr = new Array(numRows-1)
            arr[0] =  [[1]]
            arr[1] =  [[1],[1,1]]
            for(let i=2;i<numRows;i++){
                let brr=[1]
                let a = arr[i-1][arr[i-1].length-1]
                for (let j=0;j<a.length-1;j++){
                    brr.push(a[j]+a[j+1])
                }
                brr.push(1)
                arr[i] = JSON.parse(JSON.stringify(arr[i-1]))
                arr[i].push(brr)
            }

            return arr[arr.length-1]
        }
    };

