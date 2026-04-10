let express = require('express');
let app = express();
app.use(express.json());
const PORT=3000;

let usuarios = [
    {id:1, nome:"Garro"},
    {id:2, nome:"Memphis"}
]

app.get('/usuarios', function(req,res){
    res.json(usuarios)
})

app.post('/usuarios',function(req,res){
    /* let id = req.body.id;
    let nome = req.body.nome; */
    const {id,nome} = req.body
    const novoUsuario = {id:id,nome:nome}
    usuarios.push(novoUsuario)
    console.log({"dados do post": req.body})
    res.json({"MSG":"Parabens, usuario inserido com sucesso!",
        "usuario":novoUsuario})
})

app.listen(PORT, function(){
    console.log("O servidor está rodando na porta "+PORT)
})