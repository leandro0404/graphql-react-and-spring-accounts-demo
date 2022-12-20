package com.accountsapi.model


import lombok.Data
import lombok.NoArgsConstructor
import org.springframework.data.annotation.Id
import javax.persistence.*

@Data
@NoArgsConstructor
@Entity
@Table(name = "account")
class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private val id: Long = 0

    @OneToMany(mappedBy = "phones")
    private val phones: Collection<Phone>? = null

}