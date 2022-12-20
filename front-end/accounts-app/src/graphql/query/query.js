import {gql, useQuery} from "@apollo/client";

export const ACCOUNT_INFORMATION_QUERY = gql`
query {
  findAccount(id: 1) {
    id
    phones {
      id
      country
      value
      ddd
      type
    }
  }
}
`;

export const ACCOUNT_CREATE_MUTATION = gql`
mutation {
  createAccount(account: { userId: "dskladksa;lda" }) {
    id
  }

  createPhone(
    phone: {
      account_id: 1
      country: 55
      value: "993486906"
      type: RESIDENTIAL
      ddd: "31"
    }
  ) {
    id
  }
}
`;