{
    let arr=[4,3,2,10];
    let a=[];
   
    for(let i=0;i<arr.length;i++){
         let sum=0;
        for(let j=0;j<arr.length;j++){
            if(arr[i] != arr[j]){
                sum=sum+arr[j];
            }
        }
        a.push(sum)
    }
    console.log(a)
}