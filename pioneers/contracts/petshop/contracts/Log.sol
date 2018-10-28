pragma solidity ^0.4.20;

contract Log {
    event LogUint(string, uint);

    function log(string s, uint a) public {
        emit LogUint(s, a);
    }
}