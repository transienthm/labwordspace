var B = artifacts.require("B");
var A = artifacts.require("A");
var C = artifacts.require("C");

module.exports = function(deployer) {
  deployer.deploy(B);
  deployer.deploy(A);
  deployer.deploy(C);
};
