package se1268.group5.project.project.model;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "users")
public class User {

    @Id
    @NotBlank
    private String userName;

    @NotBlank
    private String password;

    @NotBlank
    private String address;

    @NotBlank
    private String phone;

    @ManyToOne
    @JoinColumn(name = "user_role_id", nullable = false)
    private UserRole userRole;

    @ManyToOne
    @JoinColumn(name = "user_status_id", nullable = false)
    private UserStatus userStatus;


    public User() {
    }

    public User(@NotBlank String userName, @NotBlank String password, @NotBlank String address, @NotBlank String phone, UserRole userRole, UserStatus userStatus) {
        this.userName = userName;
        this.password = password;
        this.address = address;
        this.phone = phone;
        this.userRole = userRole;
        this.userStatus = userStatus;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    public UserStatus getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(UserStatus userStatus) {
        this.userStatus = userStatus;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}
