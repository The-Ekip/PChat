package com.ekip.pchat.domain.applicationtoken;

import com.ekip.pchat.domain.user.AppUser;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="application_token")
public class ApplicationToken {
    @Id
    @Column(name="application_token_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long applicationTokenId;

    @Column(name = "token_quantity")
    private int tokenQuantity;

    @JsonIgnore
    @OneToOne(mappedBy = "applicationToken")
    private AppUser appUser;
}
