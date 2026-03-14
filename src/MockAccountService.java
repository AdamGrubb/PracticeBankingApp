import com.sun.net.httpserver.Authenticator;

import java.util.ArrayList;

public class MockAccountService implements IAccountService {
    private ArrayList<IAccount> accounts = new ArrayList<IAccount>();

    public ServiceResponse<IAccount> GetAccount(IAccount account) {
        ServiceResponse<IAccount> serviceResponse = new ServiceResponse<>();
        serviceResponse.Success = false;
        serviceResponse.Message = "Could not find account";
        for (int i = 0; i < accounts.toArray().length -1; i++) {
            if (accounts.get(i).Id == account.Id) {
                serviceResponse.Success = true;
                serviceResponse.Data = accounts.get(i);
            }
        }
        return serviceResponse;
    }

    public ServiceResponse<ArrayList<IAccount>> GetAccounts() {
        ServiceResponse<ArrayList<IAccount>> serviceResponse = new ServiceResponse<>();
        serviceResponse.Success = true;
        serviceResponse.Data = accounts;
        return serviceResponse;
    }

    public ServiceResponse<IAccount> CreateAccount(IAccount account) {
        ServiceResponse<IAccount> serviceResponse = new ServiceResponse<>();
        accounts.add(account);
        int indexOfNewAccount = accounts.indexOf(account);
        serviceResponse.Data = accounts.
        return serviceResponse;

    }

    public ServiceResponse<IAccount> DeleteAccount(IAccount account) {
        return null;
    }

    public ServiceResponse<IAccount> UpdateAccount(IAccount account) {
        return null;
    }
}
