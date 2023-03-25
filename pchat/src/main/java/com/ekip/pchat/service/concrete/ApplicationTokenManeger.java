package com.ekip.pchat.service.concrete;

import com.ekip.pchat.dao.ApplicationTokenReository;
import com.ekip.pchat.domain.applicationtoken.ApplicationToken;
import com.ekip.pchat.exceptionHandler.exceptions.EntityNotFountException;
import com.ekip.pchat.service.abstracts.ApplicationTokenService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ApplicationTokenManeger implements ApplicationTokenService {

    private final ApplicationTokenReository applicationTokenReository;

    @Override
    public ApplicationToken add(ApplicationToken applicationToken) {
        ApplicationToken applicationToken1 = new ApplicationToken();
        applicationToken1.setTokenQuantity(100);
        return applicationTokenReository.save(applicationToken1);
    }

    @Override
    public ApplicationToken getById(Long applicationTokenId) {
        return applicationTokenReository.findById(applicationTokenId).orElseThrow(()->new EntityNotFountException("not founded"));
    }

    @Override
    public ApplicationToken updateApplicationToken(ApplicationToken applicationToken) {
        return applicationTokenReository.save(applicationToken);
    }
}
