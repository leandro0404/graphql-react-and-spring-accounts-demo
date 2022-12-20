import logo from './logo.svg';
import './App.css';
import React from 'react';
import { useQuery, useMutation} from "@apollo/client";
import  {ACCOUNT_INFORMATION_QUERY } from './graphql/query/query'



function AccountInformation() {

    const {loading, error, data} = useQuery(ACCOUNT_INFORMATION_QUERY);
    if (loading) return <p>Loading...</p>;
    if (error) return <p>Error :(</p>;
    return data.findAccount.phones.map( (phone:any) =>
        <div key={phone.id}>
          <p> Id :    {phone.id}  </p> 
          <p> Country :    {phone.country}  </p>   
          <p> DDD :    {phone.ddd}  </p>   
          <p> Value :    {phone.value}  </p>    
          <p> Type :    {phone.type}  </p>       
        </div>
    );
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

