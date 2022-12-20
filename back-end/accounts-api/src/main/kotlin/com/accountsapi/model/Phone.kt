package com.accountsapi.model

import lombok.Data
import lombok.NoArgsConstructor
import javax.persistence.*


@Data
@NoArgsConstructor
@Entity
@Table(name = "phone")
open class Phone(
    @field:Column(name="country")  val country :Int,
    @field:Column(name = "ddd")  val ddd: String,
    @field:Column(name = "value")  val value: String,
    @field:Column(name = "Type") @field:Enumerated(
        EnumType.STRING
    )  val type: PhoneType, @field:JoinColumn(
        name = "account_id",
        nullable = false
    ) @field:ManyToOne private val account: Account
) {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = 0

}
enum class PhoneType{
    RESIDENTIAL, WORK , COMMERCIAL
}