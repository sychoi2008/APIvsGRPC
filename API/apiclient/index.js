const axios = require('axios');


console.time();
for(let i=1; i<101; i++) {
    axios({
        method: "get",
        url: `http://localhost:8080/api/v1/hello/${i}`,
        
    }).then((response)=> {
        //console.log(response.data);
    })

}
console.timeEnd();
