const express = require('express');
const path = require('path');

const app = express();
const PORT = 5000;
app.use(express.static(path.join(__dirname,'jdv')));
app.listen(PORT,()=>{
    console.log(`server rodando na porta: ${PORT}`);
})