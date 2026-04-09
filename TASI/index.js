let express = require('express');
let app = express();
const PORT=3000;

let usuarios = [
    {id:1, nome:"Garro"},
    {id:2, nome:"Memphis"}
]

app.get('/usuarios', function(req,res){
    res.json(usuarios)
})

app.listen(PORT, function(){
    console.log("O servidor está rodando na porta "+PORT)
})