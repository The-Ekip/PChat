package com.ekip.pchat.api.dto.accountDetail;

import com.ekip.pchat.api.dto.baseDtos.accountdetail.AccountDetailRequestDto;
import com.ekip.pchat.domain.accountDetail.AccountDetail;
import lombok.Data;


@Data
public class BuyPremiumResponse extends AccountDetailRequestDto {


    public  static  BuyPremiumResponse fromDto(AccountDetail accountDetail){
        BuyPremiumResponse buyPremiumResponse=new BuyPremiumResponse();
        buyPremiumResponse.setAccountStatus(accountDetail.getAccountStatus());
        buyPremiumResponse.setAccountType(accountDetail.getAccountType());
        buyPremiumResponse.setFriendsLimit(accountDetail.getFriendsLimit());
        buyPremiumResponse.setPremiumStartDate(accountDetail.getPremiumStartDate());
        return buyPremiumResponse;
    }
}
