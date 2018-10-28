module.exports = {
  // See <http://truffleframework.com/docs/advanced/configuration>
  // to customize your Truffle configuration!
    networks: {
        development: {
          host: "localhost",
          port: 8545,
          network_id: "*",
	  from: "0x07cca4f65d6e937b797202a7a68f386765377136"
        }
    }
};
