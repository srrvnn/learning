// objects for one-time use

var target = {

    name: "Anvato",
    locked_since: "2014-05-19",

    update : function (name) {

        this.name = name;
        this.locked_since = new Date().toJSON().slice(0,10);
    }
};

target.update("MyFitnessPal");
console.log(target.name);

// objects for one-time use with private variables

var privateTarget = (function () {

    var _name = "Anvato";
    var _locked_since = "2014-05-19";

    return {

        update : function (name) {

            _name = name;
            _locked_since = new Date().toJSON().slice(0,10);
        },

        print : function (name) {

            return (_name + " since " + _locked_since);
        }
    }

})();

console.log(privateTarget.name);
console.log(privateTarget);

privateTarget.update("MyFitnessPal");
console.log(privateTarget.print());

// objects for creating multiple instances with private variables

// 1. make a prototype

var attackPrototype = (function () {

    var _cry = "Attack Now!";

    return {

        setCry : function (c) {
            _cry = c;
        },

        attack : function () {
            console.log(_cry);
        }
    }

})();

// 2. make a factory

var attackFactory = function () {

    return Object.create(attackPrototype);
}

var a1 = attackFactory();
var a2 = attackFactory();

console.log(a1._cry);

a1.setCry("Hamla");
a1.attack();