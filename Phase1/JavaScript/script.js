// console.log("Hello, World! This is a simple JavaScript file.");

// const a = 5;
// //a=6;


// let name = "Alice";
// let city = "New York";
// console.log(typeof name); // Output: Alice
// console.log(`My name is ${name} and I live in ${city}.`);

// let isLoggedIn = true;
// let hasAccess= false;

// console.log(typeof isLoggedIn); // boolean

// let age = 29;
// let price = 99.50;
// console.log(typeof age); // number
// console.log(typeof price); // number

// let result ;
// console.log(result); // Output: undefined

// let data = null;
// console.log(data); // Output: null


// let bigNubmer = 123456789012345678901234567890n;
// console.log(typeof bigNubmer); // Output: bigint

// let sym1 = Symbol("id");
// let sym2 = Symbol("id");
// console.log(sym1 === sym2); // Output: false


// let result1 = 10/"abc";
// console.log(result1); // Output: NaN

// let num1 = 10/0;
// console.log(num1); // Output: Infinity



console.log(10+20+"5");
console.log("5"+10+20);

console.log("abc" - 5); // Output: 5

let person = {
    name: "Alice",
    age: 30,
    city: "New York",
    isEmployed: true
};

console.log(person.name); // Output: Alice
console.log(person["age"]); // Output: 30 Useful when property name is dynamic or not a valid identifier

person.age = 31; // Update age
console.log(person.age); // Output: 31

delete person.isEmployed; // Remove isEmployed property
console.log(person.isEmployed); // Output: undefined

let a =5;
let b =a;
a=6;
console.log(a); 
console.log(b); 


let obj1 = {x:10};
let obj2 = obj1;
obj2.x = 20;

console.log(obj1.x);

let user = {
    name: "Dhruvik",
    greet: function() {
        console.log(`Hello, my name is ${this.name}.`);
    }
}

user.greet(); // Output: Hello, my name is Dhruvik.

let numbers = [10, 20, 30, 40, 50];
console.log(numbers[0]);

console.log(numbers.length); // Output: 5

let fruits = ["Apple", "Banana", "Cherry"];
fruits.push("Date"); // Add "Date" to the end of the array
console.log(fruits); // Output: ["Apple", "Banana", "Cherry", "Date"]

fruits.pop(); // Remove the last element ("Date")
console.log(fruits); // Output: ["Apple", "Banana", "Cherry"]

fruits.shift(); // Remove the first element ("Apple")
console.log(fruits); // Output: ["Banana", "Cherry"]

fruits.unshift("Elderberry"); // Add "Elderberry" to the beginning of the array
console.log(fruits); // Output: ["Elderberry", "Banana", "Cherry"]


function greet(){
    console.log("Hello, World!");
}

greet(); // Output: Hello, World!
let y=10;
function add(a,b=0){
    let x= 10;
    return a+b+x+y;
}

let sum = add(5);
console.log(sum); // Output: 25