const answer = prompt("Enter the answer");
const mypromise = new Promise((resolve,reject)=>{
    if(answer === "no"){
        reject("You guys did not perform well in assignments")
    }else{
        resolve("i will provide good score in assignment");
    }

});

mypromise.then((res)=>{
    console.log(res);
}).catch((err)=>{
    console.log(err);
})