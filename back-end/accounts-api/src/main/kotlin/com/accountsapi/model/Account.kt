package com.accountsapi.model


import lombok.Data
import lombok.NoArgsConstructor
import javax.persistence.*

@Data
@NoArgsConstructor
@Entity
@Table(name = "account")
open class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = 0

    @OneToMany(mappedBy = "account")
    val phones: Collection<Phone>? = null

}