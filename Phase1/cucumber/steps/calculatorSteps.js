
const { Given, When, Then } = require('@cucumber/cucumber');
const assert = require('assert');
const Calculator = require('../calculator');

let calculator;
let result;

Given('I have a Calculator', function () {
    calculator = new Calculator();
});

When('I add {int} and {int}', function (a, b) {
    result = calculator.add(a, b);
});

Then('the result should be {int}', function (expected) {
    assert.strictEqual(result, expected);
});
