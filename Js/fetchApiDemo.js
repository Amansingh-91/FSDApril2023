
// fetch("https://jsonplaceholder.typicode.com/todos/1").then(res =>{
//      console.log(res);
//      return res.json()
// })
// .then(data=>{
//     console.log(data);
//     const title = document.querySelector("#title");
//     title.innerText = data.title;
//  })
// .catch(err=>{
//     console.log(err);
// })


const getData = async(url)=>{
   try {
    const res = await fetch(url);
    const data = await res.json();
    console.log(data);
    const title = document.querySelector("#title");
    title.innerText = data.title;
   } catch (error) {
    console.log(error);
   }
}

getData("https://jsonplaceholder.typicode.com/todos/2")