const mysql = require('mysql2/promise')

const db = mysql.cretePool({
    host:"localhost",
    user:"root",
    password:"root",
    database:"escola",
    waitForConnections:true,
    connectionLimit:10
})

module.exports = db;