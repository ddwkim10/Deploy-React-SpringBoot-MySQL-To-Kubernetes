import React from 'react';
import {useEffect, useState} from 'react';
import TextField from '@mui/material/TextField';
import {Container, Paper, Button} from '@mui/material'; //'@material-ui/core';

export default function ICareMemberInput() {
    
      const paperStyle={padding:'50px 20px', width:600,margin:"20px auto"}
      const[name,setName]=useState('')
      const[address,setAddress]=useState('')
      const[members,setMembers]=useState([])

      // const addURL = `http://${process.env.REACT_APP_SERVER_NAME}:8080/icare/add`
      // const showAllURL = `http://${process.env.REACT_APP_SERVER_NAME}:8080/icare/showAll`
      const addURL = "http://172.21.0.2:8080/icare/add"
      const showAllURL = "http://172.21.0.2:8080/icare/showAll" 
 
      console.log(addURL)
      console.log(showAllURL)
      
      const handleClick=(e)=>{
        e.preventDefault()
        const member={name,address}
        console.log(member)
        fetch(addURL,{
          method:"POST",
          headers:{"Content-Type":"application/json"},
          body:JSON.stringify(member)

        }).then(()=>{
          console.log("New Member added")
        })
      }

      useEffect(()=>{
        fetch(showAllURL)
        .then(res=>res.json())
        .then((result)=>{
          setMembers(result);
          }  
        )
      }, [])

      return (

          <Container>
              <Paper elevation={3} style={paperStyle}>
                  <h1 style={{color:"blue"}}><u>Add Icare Member</u></h1>

                <form className="IcareInput" /* {classes.root} */ noValidate autoComplete="off">

                  <TextField id="outlined-basic" label="Icare Member Name" variant="outlined" fullWidth
                      value={name}
                      onChange={(e)=>setName(e.target.value)}
                  />
                  <TextField id="outlined-basic" label="Icare Member Adress" variant="outlined" fullWidth
                      value={address}
                      onChange={(e)=>setAddress(e.target.value)}
                  />
                  <Button variant="contained" color="secondary" onClick={handleClick}>
                      Submit
                  </Button>

                </form>

              </Paper>
              
              <h1>iCare Membership List</h1>

              <Paper elevation={3} style={paperStyle}>

                {members.map(member=>(
                  <Paper elevation={6} style={{margin:"10px",padding:"15px", textAlign:"left"}} key={member.id}>
                  Id:{member.id}<br/>
                  Name:{member.name}<br/>
                  Address:{member.address}

              </Paper>
                  ))
                }
            </Paper>



          </Container>
      );
}
