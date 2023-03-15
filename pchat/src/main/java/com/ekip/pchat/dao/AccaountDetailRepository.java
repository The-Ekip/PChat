package com.ekip.pchat.dao;

import com.ekip.pchat.domain.accountDetail.AccountDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccaountDetailRepository extends JpaRepository<AccountDetail,Long> {
}
