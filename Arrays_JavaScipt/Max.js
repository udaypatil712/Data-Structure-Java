{
    let arr=[2,3,5,4,6,9,8]; 
    for(let i=1;i<arr.length-1;i++){
        if(arr[i]>max){
            max=arr[i];
        }
    }
    console.log(max)
           
    // const arr=[5,6,8];
    // let max=Math.max(...arr);                                            
    // console.log("max element.."+max)
}