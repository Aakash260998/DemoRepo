const express = require('express')
const router = express.Router()
const Blog = require('../models/blog')


router.get('/', async(req,res) => {
    try{
           const blogs = await Blog.find()
           res.json(blogs)
    }catch(err){
        res.send('Error ' + err)
    }
})

router.get('/:id', async(req,res) => {
    try{
           const blog = await Blog.findById(req.params.id)
           res.json(blog)
    }catch(err){
        res.send('Error ' + err)
    }
})


router.post('/', async(req,res) => {
    const blog = new Blog({
        title: req.body.title,
        category: req.body.category,
        content: req.body.content
    })

    try{
        const a1 =  await blog.save() 
        res.json(a1)
    }catch(err){
        res.send('Error')
    }
})

router.patch('/:id',async(req,res)=>
{
    const id=req.params.id
    
    try{
        const blog=await Blog.findById(id)
        blog.title=req.body.title
        blog.category=req.body.category
        blog.content=req.body.content
        const b=await blog.save()
        res.json(b)
    }
    catch(err)
    {
        res.send("error")
    }
})
router.delete('/:id',async(req,res)=>
{
    const id=req.params.id
    try{
     const result=await Blog.findByIdAndDelete(id)
      res.send(result)
    }
    catch(error)
    {
        console.log(error)
    }

})

module.exports = router