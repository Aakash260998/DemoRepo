const express = require('express')
const mongoose = require('mongoose')
const url = 'mongodb://localhost/Blogdb'
const cors=require('cors')
const app = express()

mongoose.connect(url, {useNewUrlParser:true})
const con = mongoose.connection

con.on('open', () => {
    console.log('connected...')
})
app.use(cors())
app.use(express.json())

const blogRouter = require('./routes/blogs')
app.use('/blogs',blogRouter)

app.listen(9000, () => {
    console.log('Server started')
})
