import {gql, useQuery} from "@apollo/client";

export const DELETE_PHONE = gql`
  mutation($id: Int) {
    deletePhone(phone:{id: $id})
  }
`


export const ADD_PHONE = gql`
mutation ($account_id: Int, $value: String, $country: String, $ddd: String) {
    createPhone(
      phone: {
        account_id: $account_id
        country: $country
        value: $value
        type: RESIDENTIAL
        ddd: $ddd
      }
    ) {
      id
      country
      ddd
      value
      type
    }
  }
  
`


  