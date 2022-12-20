import logo from './logo.svg';
import './App.css';
import React from 'react';
import { useQuery, useMutation} from "@apollo/client";
import  {ACCOUNT_INFORMATION_QUERY } from './graphql/query/query'



function AccountInformation() {

    const {loading, error, data} = useQuery(ACCOUNT_INFORMATION_QUERY);
    if (loading) return <p>Loading...</p>;
    if (error) return <p>Error :(</p>;
    
    var account =  data.findAccount

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
        </div>
    );

    return [profile , phones]
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

