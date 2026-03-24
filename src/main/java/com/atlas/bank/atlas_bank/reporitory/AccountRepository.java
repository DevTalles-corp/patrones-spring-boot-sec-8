package com.atlas.bank.atlas_bank.reporitory;

import com.atlas.bank.atlas_bank.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
