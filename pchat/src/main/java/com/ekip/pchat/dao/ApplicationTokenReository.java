package com.ekip.pchat.dao;

import com.ekip.pchat.domain.applicationtoken.ApplicationToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationTokenReository extends JpaRepository<ApplicationToken,Long> {
}
