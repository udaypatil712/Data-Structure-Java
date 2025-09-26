// altitude[0] = 0
// altitude[1] = 0 + (-5) = -5
// altitude[2] = -5 + 1 = -4
// altitude[3] = -4 + 5 = 1
// altitude[4] = 1 + 0 = 1
// altitude[5] = 1 + 8 = 9

{
  
    let arr =[-5,1, 5, 0, -7];
    let max=arr[0];
    let sum=0;

    for(let i=0;i<arr.length;i++){
        sum=sum+arr[i];
        if(sum>max){
            max=sum;
        }
    }
    console.log(max);

}