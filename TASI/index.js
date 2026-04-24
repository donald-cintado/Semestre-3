let express = require('express');
let app = express();
app.use(express.json());
const PORT=3000;

const db = require("./db")


app.get('/alunos',(req,res)=>{
    db.query("SELECT * FROM alunos", function(err, results){
        if(err){
            return res.status(500).json({mensagem_erro:"Erro no server"})
        }
        res.json(results)
    })
})

app.get('/alunos', function(req,res){
    const id = parseInt(req.params.id)
    db.query("SELECT * FROM alunos WHERE id = ?",[id],(err,results)=>{
        if(err) return res.status(500).json({mensagem_erro:"Erro no Server!"})
            if(results.length === 0){
                return res.status(404).json({mensagem_erro:"Aluno não encontrado"})
            }
            res.json(results[0])
    })
})

app.post('/alunos',(req,res)=>{
    const {nome} = req.body
    db.query ("INSERT INTO alunos (nome) VALUES (?)",[nome],(err,result)=>{
        if(err){
            res.status(500).json({mensagem_erro:"Erro no Server!"})
        }
        res.status(201).json({
            "mensagem":"usuario inserido com sucesso",
            id:result.insertId,
            nome
        })
    })
})

app.put('/alunos/:id', async(req,res)=>{
    const id = req.params.id;
    const {nome} = req.body;
    try {
        const [results] = await db.query("UPDATE alunos SET nome = ? WHERE id = ? ", [nome,id])
        if(result.affectRows === 0){
            return res.status(404).json({erro:"Aluno não encontrado"})} 
        res.json({
            "mensagem":"aluno atualizado",
            id,nome
        })           
    } catch (error) {
        res.status(500).json({"mensagem":"erro interno do server"})
    }
})

app.delete('/alunos/:id', async(req,res)=>{
    const id = req.params.id;
    try {
        const [result] = await db.query('DELETE FROM aluno WHERE id = ?',[id])
        if(result.affectRows === 0){
            return res.status(404).json({"erro":"aluno não encontrado"})
        }
        res.json({"mensagem":"aluno removido com sucesso"})
    } catch (err) {
        console.error(err)
        res.status(500).json({"mensagem":"erro interno do server"})
    }
})

app.listen(PORT, function(){
    console.log("O servidor está rodando na porta "+PORT)
})