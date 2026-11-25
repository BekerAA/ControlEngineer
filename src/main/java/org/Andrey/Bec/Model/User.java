package org.Andrey.Bec.Model;


import org.Andrey.Bec.Model.NoEntity.Role;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "lastname")
    private String lastName;

    private String email;

    @Enumerated(EnumType.STRING)
    private Role role;

    public User(String name, String lastName, String email, Role role) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.role = role;
    }

    public User() {}

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Role getRole() {
        return role;
    }

    public String getEmail() {
        return email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", role=" + role +
                '}';
    }

    public static UserBulder builder(){
        return new UserBulder();
    }


    public static class UserBulder{

        private String name;

        private String lastName;

        private String email;

        private Role role;

        public UserBulder(){}

        public UserBulder name(String name){
            this.name = name;
            return this;
        }

        public UserBulder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public UserBulder email(String email){
            this.email = email;
            return this;
        }

        public UserBulder role(Role role){
            this.role = role;
            return this;
        }

        public User build(){
            return new User(name, lastName, email, role);
        }

    }
}
