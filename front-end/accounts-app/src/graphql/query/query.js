import {gql, useQuery} from "@apollo/client";

export const ACCOUNT_INFORMATION_QUERY = gql`
query
{
  getAllPeople
  {
    id
    name
    age
    gender
    documents
    {
      id
      value
      type
    }
  }
}
`;