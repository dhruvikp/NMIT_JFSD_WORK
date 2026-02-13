
console.log(0 && "Hello");
console.log("Hi" && "Hello")

console.log(0 || "Hello");
console.log("Hi" || "Hello")

console.log(!0);
console.log(!"Hi");

let age = 20; // Example age value
let result = age >= 18 ? "Adult" : "Minor";

//(cond) ? (value if true) : (value if false)
 
console.log(result); // Output: "Adult" or "Minor" depending on the value of age


console.log(5 & 1);

let result2 = 10 + 20 * 5; // Multiplication has higher precedence than addition
console.log(result2); // Output: 110


let age1 = 20;
if(age1 >= 18) {
    console.log("You are an adult.");
} else {
    console.log("You are a minor.");
}

let score = 85;

if (score >= 90) {
    console.log("Grade: A");
} else if (score >= 80) {
    console.log("Grade: B");
} else if (score >= 70) {
    console.log("Grade: C");
} else if (score >= 60) {
    console.log("Grade: D");
} else {
    console.log("Grade: F");
}   


if("") {
    console.log("This will not be printed.");
} else {
    console.log("This will be printed because an empty string is falsy.");
}

let day = 3;

switch(day) {
    case 1:
        console.log("Monday");
        break;
    case 2:
        console.log("Tuesday");
        break;
    case 3:
        console.log("Wednesday");
        
    case 4:
        console.log("Thursday");
        break;
    case 5:
        console.log("Friday");
        break;
    case 6:
        console.log("Saturday");
        break;
    case 7:
        console.log("Sunday");
        break;
    default:
        console.log("Invalid day number.");
}   


for(let i=0; i<5; i++) {
    console.log(i); // Output: 0, 1, 2, 3, 4
}

// While loop.
// When number of iterations is not known beforehand, we can use while loop.

let i=1;
while(i<=5) {
    console.log(i); // Output: 1, 2, 3, 4, 5
    i++;
}

// Do-while loop.
// Executes the block of code at least once, and then continues to execute as long as the condition is true.
let j = 1;
do {
    console.log(j); // Output: 1, 2, 3, 4, 5
    j++;
} while(j <= 5);

// for..of loop
// Used to iterate over iterable objects like arrays, strings, etc.
let arr = [10, 20, 30, 40, 50];
for(let num of arr) {
    console.log(num); // Output: 10, 20, 30, 40, 50
}
// for..in loop
// Used to iterate over the properties of an object.
let person1 = {
    name: "Alice",
    age: 30,
    city: "New York"
};

for(let key in person1) {
    console.log(`${key}: ${person1[key]}`);
    // Output:
    // name: Alice
    // age: 3 0
    // city: New York
}

// break statement
// stops loop completely when a certain condition is met.
for(let i=0; i<10; i++) {
    if(i === 5) {
        break; // Exit the loop when i is 5
    }
    console.log(i); // Output: 0, 1, 2, 3, 4
}

// continue statement
// skips the current iteration and continues with the next one when a certain condition is met.
for(let i=0; i<10; i++) {
    if(i % 2 === 0) {
        continue; // Skip even numbers
    }
    console.log(i); // Output: 1, 3, 5, 7, 9
}

let user1 = {name: "Dhruvik", age: 25, city: "Ahmedabad"};

let cloneUser = {...user1}; // Using spread operator to clone the user object

console.log(cloneUser); // Output: {name: "Dhruvik", age: 25, city: "Ahmedabad"}

cloneUser.name = "John"; // Modifying the name property of the cloned object

console.log(user1.name); // Output: "Dhruvik" - original user object is unchanged

let cloneUser2 = Object.assign({}, user1); // Using Object.assign to clone the user object

// Shallow clone problem (Nested objects are not cloned properly)

let user2 = {
    name: "Dhruvik",
    age: 25,
    city: "Ahmedabad",
    address: {
        street: "123 Main St",
        city: "Ahmedabad"
    }
};

let cloneUser3 = {...user2}; // Shallow clone using spread operatorcloneUser3.address.street = "456 Elm St"; // Modifying the nested address object console.log(user2.address.street); // Output:
cloneUser3.address.street = "456 Elm St"; // Modifying the nested address object
console.log(user2.address.street); // Output: "123 Main St" - original user2 object is unchanged




let user3 = {
    name: "Dhruvik",
    age: 25,
    city: "Ahmedabad",
    address: {
        street: "123 Main St",
        city: "Ahmedabad"
    }
};

console.log(JSON.stringify(user3)); // Convert user3 object to JSON string
// Deep clone using JSON methods
let cloneUser4 = JSON.parse(JSON.stringify(user3));

cloneUser4.address.street = "456 Elm St"; // Modifying the nested address object
console.log(user3.address.street); // Output: "123 Main St" - original user3 object is unchanged

let cloneUser5 = structuredClone(user3); // Deep clone using structuredClone (available in modern browsers)


//-------OBJECT CREATION------------

function createPerson(firstName, lastName) {
    return {
        firstName: firstName,
        lastName: lastName,
        fullName: function() {
            return `${this.firstName} ${this.lastName}`;
        }
    };
}

let person3 = createPerson("Dhruvik", "Parikh");
let person4 = createPerson("John", "Doe");

console.log(person3.fullName());


// Optimization:
function createPersonOptimized(firstName, lastName) {
    return { 
        firstName: firstName,
        lastName: lastName
    };
}

// store methods seperately.

var personsAction = {
    getFullName() {
        return this.firstName + " " + this.lastName;
    }
}

let person5 = createPersonOptimized("Dhruvik", "Parikh");
let person6 = createPersonOptimized("John", "Doe");

// Assign the method to the person objects
person5.getFullName = personsAction.getFullName;
person6.getFullName = personsAction.getFullName;

// Object.create method to create a new object with a specified prototype object and properties.
let personProto = {
    getFullName() {
        return this.firstName + " " + this.lastName;
    }
};

function createPersonWithProto(firstName, lastName) {
    let person = Object.create(personProto);
    person.firstName = firstName;
    person.lastName = lastName;
    return person;
}

// Using constructor function
function PersonConstructor(firstName, lastName) {
    this.firstName = firstName; 
    this.lastName = lastName; 
}

// Adding methods.
PersonConstructor.prototype.getFullName = function() {
    return this.firstName + " " + this.lastName; 
}

const person7 = new PersonConstructor("Dhruvik", "Parikh");

console.log(Math.PI); // Output: 3.141592653589793

//Math.round() - Rounds a number to the nearest integer.
console.log(Math.round(4.7)); // Output: 5
console.log(Math.round(4.3)); // Output: 4

//Math.ceil() - Rounds a number up to the next largest integer.
console.log(Math.ceil(4.3)); // Output: 5


// Math.floor() - Rounds a number down to the next smallest integer.
console.log(Math.floor(4.7)); // Output: 4

// Math.pow() - Returns the base to the exponent power, that is, base^exponent.
console.log(Math.pow(2, 3)); // Output: 8 (2 raised to the power of 3)

// Math.sqrt() - Returns the square root of a number.
console.log(Math.sqrt(16)); // Output: 4 (Square root of 16)

//Math.abs() -- Returns absoluate (positive) value of a number.
Math.abs(-5); // Output: 5

// Math.max() - Returns the largest of zero or more numbers.
console.log(Math.max(10, 20, 5)); // Output: 20

// Math.min() - Returns the smallest of zero or more numbers.
console.log(Math.min(10, 20, 5)); // Output: 5

// Math.random() - Returns a random number between 0 (inclusive) and 1 (exclusive).
console.log(Math.random()); // Output: A random number between 0 and 1 (e.g., 0.123456789)

console.log(Math.floor(Math.random() * 100) + 1); // Output: A random integer between 1 and 100

let name = "JavaScript";
console.log(name.length);

console.log("hello".toUpperCase()); // Output: "HELLO"
console.log("WORLD".toLowerCase()); // Output: "world"

console.log(" Hello World! ".trim()); // Output: "Hello World!"

console.log("JavaScript".includes("Script")); // Output: true

console.log("JavaScript".startsWith("Java")); // Output: true
console.log("JavaScript".endsWith("Script")); // Output: true

console.log("banana".indexOf("a")); // Output: 1 (first occurrence of "a")
console.log("banana".lastIndexOf("a")); // Output: 5 (last occurrence of "a")

console.log("JavaScript".slice(0, 4)); // Output: "Java" -- Extract part of a string.

console.log("JavaScript".substring(0,4)); // Output: "Java" -- Similar to slice but does not accept negative indices.

console.log("Hello World".replace("World", "JavaScript")); // Output: "Hello JavaScript" -- Replace part of a string with another string.

console.log("ha ha ha".replaceAll("ha", "ho")); // Output: "ho ho ho" -- Replace all occurrences of a substring with another string.

console.log("red,green,blue".split(",")); // Output: ["red", "green", "blue"] -- Split a string into an array of substrings based on a specified separator.

console.log("Hello".concat(" ", "World")); // Output: "Hello World" -- Concatenate strings together.

console.log("Hello".charAt(1)); // Output: "e" -- Return the character at a specified index in a string.

// String literals and template literals
let name1 = "Rahul";
let greeting = `Hello, ${name1}!`; // Using template literals to embed expressions
console.log(greeting); // Output: "Hello, Rahul!"

let a = 10;
let b = 20;

let result1 = `The sum of ${a} and ${b} is ${a + b}.`; // Using template literals to perform calculations
console.log(result1); // Output: "The sum of 10 and 20 is 30."

// Multi-line strings using template literals
let multiLineString = `This is a multi-line string.
It can span multiple lines without needing escape characters.
This makes it easier to read and write.`;
console.log(multiLineString);

// Function calls inside Template Literals
function getCurrentDate() {
    return new Date().toLocaleDateString();
}

let dateString = `Today's date is ${getCurrentDate()}.`;

