import java.util.ArrayList;

public interface IAccountService {
    public ServiceResponse<IAccount> GetAccount();
    public ServiceResponse<ArrayList<IAccount>> GetAccounts();
    public ServiceResponse<IAccount> CreateAccount(IAccount account);
    public ServiceResponse<IAccount> DeleteAccount(IAccount account);
    public ServiceResponse<IAccount> UpdateAccount(IAccount account);
}
