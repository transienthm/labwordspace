pragma solidity ^0.4.20;

contract User {
    string private name;

    function setName(string _name) public {
        name = _name;
    }
}