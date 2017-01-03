package lab8.account;

public interface AccountManager {
	Account findAccountForUser(String userId);

	void updateAccount(Account account);
}