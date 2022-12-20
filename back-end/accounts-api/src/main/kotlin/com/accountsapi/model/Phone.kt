package com.accountsapi.model

import lombok.Data
import lombok.NoArgsConstructor
import javax.persistence.*


@Data
@NoArgsConstructor
@Entity
@Table(name = "phone")
class Phone(
    @field:Column(name="country") private val country :Int,
    @field:Column(name = "value") private val value: String,
    @field:Column(name = "Type") @field:Enumerated(
        EnumType.STRING
    ) private val type: PhoneType, @field:JoinColumn(
        name = "phone_id",
        nullable = false
    ) @field:ManyToOne private val account: Account
) {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private val id: Long? = null

}
enum class PhoneType{
    RESIDENTIAL, WORK , COMMERCIAL
}