// network request
// network response

//create request object
const http = new XMLHttpRequest(); //ready state 0

// applying event listener to this hhtp object to listen to our request and response
http.addEventListener("readystatechange",(e)=>{
    console.log(e.target.status);
    if(e.target.readyState === 4 && e.target.status === 200){
        console.log(e);
        console.log(e.target.response);

        const title = document.querySelector("#title");
        const res =  e.target.response;
        
        console.log(typeof(res));
        title.innerText = res ;
    }
})

// provide url to make request
http.open("GET","https://jsonplaceholder.typicode.com/todos/1"); //ready state 1

// send the request
http.send();//ready state 2









