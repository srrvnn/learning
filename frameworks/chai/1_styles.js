console.log ("

	Three different assertion styles: assert, expect, and should; 

	");

// starter code 


var foo = 'bar';
var beverages = { tea: ['chai', 'mocha', 'oolong'] };


// assert style 

var assert = require('chai').assert;

assert.typeOf(foo, 'string', 'foo is a string');
assert.equal(foo, 'bar', 'foo is equal to bar');
assert.lengthOf(foo, 3, 'foo has a value with length 3');

// expect style
// expect is an interface that gives a function to be used

var expect = require('chai').expect;

expect(foo).to.be.a('string');
expect(foo).to.equal('bar');
expect(foo).to.have.length(3);
expect(beverages).to.have.property('tea').with.length('3');

expect(foo, 'variable - foo').to.equal('car');

// should style
// should adds itself to Object.prototype as a property

var should = require('chai').should();

foo.should.be.a('string');
foo.should.equal('bar');
foo.should.have.length('3');
beverages.should.have.property('tea').with.length('3');

should.exist()
should.not.exist()
should.equal()
should.not.equal()
should.Throw()
should.not.Throw()