import logo from './logo.svg';
import './App.css';
import React from 'react';
import { useQuery} from "@apollo/client";
import  {ACCOUNT_INFORMATION_QUERY} from './graphql/query/query'



function AccountInformation() {
    const {loading, error, data} = useQuery(ACCOUNT_INFORMATION_QUERY);
    if (loading) return <p>Loading...</p>;
    if (error) return <p>Error :(</p>;
    return data.getAllPeople.map( (person:any) =>
        <div key={person.id}>
          <p> Id :    {person.id}  </p> 
          <p> name :    {person.name}  </p> 
          <p> gender :    {person.gender}  </p> 
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

