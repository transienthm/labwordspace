pragma solidity ^0.4.20;
pragma experimental ABIEncoderV2;
import "./Log.sol";

contract TestArray {
    string[] public myArray;
    Log log = new Log();

    function getArray() public view returns (string[] memory) {
        return myArray;
    }

    function pushTo(string a) public {
        log.log("wenfeng", 250);
        myArray.push(a);
    }
}