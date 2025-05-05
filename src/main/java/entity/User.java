package entity;

import constant.UserRole;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class User
    {
        private String id;
        private String username;
        private String password;
        private UserRole role;

    }
