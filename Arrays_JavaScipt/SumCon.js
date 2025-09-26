{
    let arr=[1,2,3,4,5];
    let target=7;
    let sum = sumCons(arr,target);
    console.log(sum)


    function sumCons(arr,target){
        for(let i=0;i<arr.length;i++){
            for(let j=0;j<arr.length;j++){
                if(arr[i] + arr[j] === target){
                    return [i,j]; // true
                }
            }
        }
        return false;
    }
}