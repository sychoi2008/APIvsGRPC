const path = require('path');
const PROTO_PATH = path.resolve(__dirname, 'proto/HelloWorld.proto');

const GRPCClient = require('node-grpc-client');

const myClient = new GRPCClient(PROTO_PATH, 'hello', 'HelloWorld', 'localhost:8080');


console.time();
for(let i=1; i<11; i++) {
    const dataToSend = {
        index: i,
        weight: i*10,
        msg: 'HelloWorld'
    }
    myClient.runService('HelloWorld', dataToSend, (err, res) => {
        console.log('response: ', res);
    }, {});
}
console.timeEnd();