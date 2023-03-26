package com.ekip.pchat.utilty;

import com.ekip.pchat.domain.accountDetail.AccountDetail;
import com.ekip.pchat.domain.accountDetail.AccountType;
import com.ekip.pchat.service.abstracts.AccountDetailService;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class AccountUpdater {

    private AccountDetail accountDetail;
    private ScheduledExecutorService scheduler;
    private final AccountDetailService accaountDetailService;

    public AccountUpdater(AccountDetail accountDetail, AccountDetailService accaountDetailService) {
        this.accountDetail = accountDetail;
        this.accaountDetailService = accaountDetailService;


        // Create a scheduler with a single thread
        scheduler = Executors.newSingleThreadScheduledExecutor();

        // Calculate the delay until the update should run
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime updateDate = accountDetail.getPremiumDeadline();
        Duration delay = Duration.between(now, updateDate);

        // Schedule the update task to run after the delay
        scheduler.schedule(() -> {
            // Your task code here, updating the user's status field
            accountDetail.setAccountType(AccountType.STANDARD);
            accountDetail.setPremiumStartDate(null);
            System.out.println("CALISTI");
            accaountDetailService.updateAccountType(accountDetail);
            stop();
        }, delay.toMillis(), TimeUnit.MILLISECONDS);
    }

    public void stop() {
        // Shutdown the scheduler when stopping the updater
        scheduler.shutdown();
    }
}