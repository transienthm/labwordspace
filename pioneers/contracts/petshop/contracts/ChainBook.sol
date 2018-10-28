pragma solidity ^0.4.20;
pragma experimental ABIEncoderV2;

library LUser {
    struct Book {
        string bookName;
    }

    struct User {
        string openid;
        string userName;
        Book[] books;
    }

    function addBook(User storage _u, string _bookName) internal {
        _u.books.push(Book(_bookName));
    }
}



contract C {
    using LUser for LUser.User;

    mapping (string => LUser.User) users;

    function createUser(string _openid, string _userName) public {
        users[_openid].openid = _openid;
        users[_openid].userName = _userName;
    }

    function addBook(string openid, string bookName) public {
        users[openid].addBook(bookName);
    }

    function getUserBooksByOpenIdAndBookIndex(string openid, uint index) public view returns(string) {
        return users[openid].books[index].bookName;
    }

    function getUserBookNumsByOpenId(string openid) public view returns(uint256) {
        return users[openid].books.length;
    }

    function getUserBooksByOpenId(string openid) public view returns(string memory) {
        string[] memory arrays;
        LUser.User storage user = users[openid];
        for(uint i = 0;i<2;i++) {
            arrays[0] = user.books[i].bookName;
        }
        return arrays[0];
    }
}