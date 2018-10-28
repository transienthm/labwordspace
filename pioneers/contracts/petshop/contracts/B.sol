pragma solidity ^0.4.20;

contract B {
    string public name;
    
    function setName(string _name) public {
        name = _name;
    }

    function returnContractAddress() public view returns (B) {
        return this;
    }
}

contract A {
    B public b;

    function setB(B _b) public {
        b = _b;
    }

    function getB() public view returns (string){
        return b.name();
    }
}