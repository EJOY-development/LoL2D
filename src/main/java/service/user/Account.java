package service.user;

public class Account {
    private String accountId;
    private String email;
    private String id;
    private String nickname;
    private String encryptedPassword;

    public Account(String accountId, String email, String id, String nickname, String encryptedPassword) {
        this.accountId = accountId;
        this.email = email;
        this.id = id;
        this.nickname = nickname;
        this.encryptedPassword = encryptedPassword;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }
}