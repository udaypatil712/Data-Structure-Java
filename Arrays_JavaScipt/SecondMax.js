{
    let arr=[1,2,3,4,5,5];
    let ans=findSec(arr);
    console.log(ans)
     

    function findSec(arr){
         let larget=arr[0]
         let slarget=-Infinity;

         for(let i=1;i<arr.length;i++){
            if(arr[i] > larget){
                slarget=larget;
                larget=arr[i];
            }else if(arr[i] < larget && arr[i] > slarget){
                slarget=arr[i];
            }
         }
         return slarget;

    }
    
}
