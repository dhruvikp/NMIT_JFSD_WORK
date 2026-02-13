
console.log(x);
var x = 10;

// let and cost --> hoisted but kept in Temporal Dead Zone (TDZ) until they are initialized


sayHello();

function sayHello() {
    console.log("Hello, World!");
}

//sayHi();
var sayHi = function() {
    console.log("Hi, there!");
}

//greet();
const greet = () => {
    console.log("Greetings!");
}


const myPromise = new Promise(
    
    (resolve, reject) => {
    setTimeout(() => {
        reject("Promise rejected!");
    }, 2000);
}
);

myPromise.then(result => {
    console.log(result); // Output: "Promise resolved successfully!" after 2 seconds
}).catch(error => {
    console.error(error);
}).finally(() => {
    console.log("Promise has been handled (either resolved or rejected).");
});

console.log('This will be logged before the promise is resolved or rejected.');
console.log('This demonstrates the asynchronous nature of promises.');
console.log('The promise will be handled after the current synchronous code has finished executing.');



function getData() {
        return new Promise((resolve, reject) => {
            setTimeout(() => {
                resolve("Data fetched successfully!");
            }, 2000);
        })
    }

getData().then(result => console.log(result));

getData()
.then(data => data.toUpperCase())
.then(upperData => console.log(upperData))
.catch(error => console.error(error))
.finally(() => console.log("Data fetching process completed."));

//-------------------async/await-------------------

async function greet() {
    return "Hello, Async/Await!";
}

// Promise.resolve("Hello,  Async/Await!");

 async function fetchData() {
    try {
        let data = await getData();
        console.log(data);
        } catch(error) {
            console.error(error);
        }   
    }

fetchData();


