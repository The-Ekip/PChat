package com.ekip.pchat.service.abstracts;

import com.ekip.pchat.domain.applicationtoken.ApplicationToken;
import com.fasterxml.jackson.databind.node.LongNode;
import org.springframework.stereotype.Service;

@Service
public interface ApplicationTokenService {

    ApplicationToken add(ApplicationToken applicationToken);
    ApplicationToken getById(Long applicationTokenId);
    ApplicationToken updateApplicationToken(ApplicationToken applicationToken);
}
