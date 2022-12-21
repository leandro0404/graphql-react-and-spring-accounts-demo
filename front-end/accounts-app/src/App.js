import logo from './logo.svg';
import './App.css';
import React from 'react';
import { useQuery, useMutation} from "@apollo/client";
import  {ACCOUNT_INFORMATION_QUERY } from './graphql/query/query'
import  {DELETE_PHONE } from './graphql/mutation/mutation'



function AccountInformation() {

  
  const [deleteRegistro] = useMutation(DELETE_PHONE);

  const {loading, error, data} = useQuery(ACCOUNT_INFORMATION_QUERY);

  function handleDelete(id) {
    deleteRegistro({ variables: { id } });
   
  }

  

  function handleLoad() {
   
    if (loading) return <p>Loading...</p>;
    if (error) return <p>Error :(</p>;
    
     const account =  data.findAccount
  
      var profile = (<div>
  
      <p> Id :    {account.id}  </p> 
            <p> Name :    {account.profile.name}  </p>   
            <p> Email :    {account.profile.email}  </p>  
            <p> Avatar :   {account.profile.avatar.id}  </p>  
      </div>)
      
      var phones = data.findAccount.phones.map( (phone:any) =>
          <div key={phone.id}>
            <p> Id :    {phone.id}  </p> 
            <p> Country :    {phone.country}  </p>   
            <p> DDD :    {phone.ddd}  </p>   
            <p> Value :    {phone.value}  </p>    
            <p> Type :    {phone.type}  </p>   
            <button onClick={() => handleDelete(phone.id)}> Delete Phone</button>
          </div>
      );
  
      return [profile , phones]
  }
  return handleLoad()

  
}


function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />

    
        <AccountInformation/>
      </header>
     
    </div>
  );
}

export default App;

