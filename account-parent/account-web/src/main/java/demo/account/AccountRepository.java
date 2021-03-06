package demo.account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface AccountRepository extends JpaRepository<Account, Long> {

    Account findAccountByUserId(@Param("userId") Long userId);
    Account findAccountByAccountNumber(@Param("accountNumber") String accountNumber);
}
