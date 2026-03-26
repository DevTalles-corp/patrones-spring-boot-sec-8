package com.atlas.bank.atlas_bank.account.controller;

import com.atlas.bank.atlas_bank.account.model.Account;
import com.atlas.bank.atlas_bank.account.service.IAccountService;
import com.atlas.bank.atlas_bank.transaction.model.Transaction;
import com.atlas.bank.atlas_bank.transaction.service.ITransactionQueryService;
import com.atlas.bank.atlas_bank.transaction.service.ITransferService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/v1/accounts")
@RequiredArgsConstructor
public class AccountController {

    private final IAccountService accountService;
    private final ITransferService transferService;
    private final ITransactionQueryService transactionQueryService;

    @PostMapping
    public ResponseEntity<Account> create(@RequestBody Account account){
        return ResponseEntity.status(HttpStatus.CREATED).body(accountService.create(account));
    }

    @GetMapping
    public ResponseEntity<List<Account>> findAll(){
        return ResponseEntity.ok(accountService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Account> findById(@PathVariable Long id){
        return ResponseEntity.ok(accountService.findById(id));
    }



}








