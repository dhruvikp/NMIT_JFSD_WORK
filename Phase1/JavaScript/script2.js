
function add(a,b) {
    //console.log(this)
    console.log(arguments)
    return a+b;
}

console.log(add(5, 10)); // Output: 15

const add1 = (a, b) => a + b;

console.log(add1(5, 10)); // Output: 15

const square = x => x * x;
console.log(square(5)); // Output: 25

const greet = () => "Hello, World!";
console.log(greet()); // Output: "Hello, World!"

const multiply = (a, b) => {
    let result = a * b;
    return result;
}

console.log(multiply(5, 10)); // Output: 50

const arrow = () => {console.log(this)};
arrow(); // Output: Window object (in a browser environment) or global object (in Node.js)


let fruits = ["Apple", "Banana", "Cherry", "mango", "orange"];

fruits.splice(1,2);
console.log(fruits); // Output: ["Apple", "mango","orange"]


fruits.splice(1,0,"grape","kiwi");
console.log(fruits); // Output: ["Apple", "grape", "kiwi", "mango","orange"]


fruits.splice(1,1,"Date");
console.log(fruits); // Output: ["Apple", "Date", "kiwi", "mango","orange"]

let nums = [1, 2, 3, 4, 5];
let removed = nums.splice(2, 2);
console.log(nums);
console.log(removed); // Output: [3, 4]

let nums1 = [1, 2, 3, 4, 5];
nums1.splice(-1,1);
console.log(nums1);

let nums2 = [1, 2, 3, 4, 5];
let doubled = nums2.map(n => n * 2);
console.log(doubled); // Output: [2, 4, 6, 8, 10]

let users = ["dhruvik","john","neha"];
let uppercaseUsers = users.map(user => user.toUpperCase());
console.log(uppercaseUsers); // Output: ["DHRUVIK", "JOHN", "NEHA"]

 let nums3 = [1, 2, 3, 4, 5];
 let evens = nums3.filter(n => n % 2 === 0);
    console.log(evens); // Output: [2, 4]

let nums4 = [1, 2, 3, 4, 5];
let sum = nums4.reduce((acc, n) => acc + n, 0);
console.log(sum); // Output: 15

let expenses = [100, 200, 300];
let totalExpenses = expenses.reduce((total, expense) => total + expense, 0);
console.log(totalExpenses); // Output: 600



let nums5 = [1, 2, 3, 4, 5];

let result = nums5
.filter(n=> n % 2 === 0)
.map(n => n * 2)
.reduce((acc, n) => acc + n, 0);


console.log(result);

let nums6 = [1, 2, 3, 4, 5];

let index = nums6.findIndex(n=>n>3);
console.log(index); 

