// let age = 24;
// age = "twenty-four"; // This will cause a type error because age is inferred to be a number

let age: number = 24; // Explicitly declaring the type of age as number

let isInstructor: boolean = true; // Explicitly declaring the type of isInstructor as boolean

let hobbies: string[] ;
hobbies = ["Sports", "Cooking"]; // Assigning an array of strings to hobbies'



let person: {
    name: string;
    age: number;
} ;


person = {
    name: "Max",
    age: 24
}


let course = 'Angular';

// Union Types
let course2: string | number = 'Angular';
course2 = 123;
course2 = 'Angular 2.0';

// Type Aliases
// creates custom reusable types
type Person = {
  name: string;
  age: number;
};

let pserson1: Person ;

// Functions and Types
function add(a: number, b: number): number | string {
  if (a + b > 10) {
    return "Result is greater than 10";
  }
  return a + b;
}

let result = add(2, 3);


// Generics solution

function insertAtBeginning<T>(array: T[], value: T): T[] {
  return [value, ...array];
}

const demoArray = [1, 2, 3];
const updatedArray = insertAtBeginning(demoArray, 0); // Type is inferred as number[]

const stringArray = insertAtBeginning(['a', 'b', 'c'], 'z'); // Type is inferred as string[]

// Classes in TypeScript

class Student {
  private firstName: string;
  private lastName: string;
  private age: number;
  private courses: string[];

  constructor(firstName: string, lastName: string, age: number, courses: string[]) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.courses = courses;
  }

  enroll(courseName: string): void {
    this.courses.push(courseName);
  }
  
  listCourses(): string[] {
    return this.courses;
  }

}

const student1 = new Student('John', 'Doe', 20, ['Math', 'Physics']);
student1.enroll('Chemistry');
console.log(student1.listCourses()); // Output: ['Math', 'Physics', 'Chemistry']

// Interfaces in TypeScript

interface Human {
  firstName: string;
  lastName: string;
  age: number;
  greet(): string;
}

class Employee implements Human {
  firstName: string;
  lastName: string;
  age: number;
  jobTitle: string;

  constructor(firstName: string, lastName: string, age: number, jobTitle: string) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.jobTitle = jobTitle;
  }

  greet(): string {
    return `Hello, my name is ${this.firstName} ${this.lastName} and I am a ${this.jobTitle}.`;
  }
}

const employee1 = new Employee('Jane', 'Smith', 30, 'Software Engineer');