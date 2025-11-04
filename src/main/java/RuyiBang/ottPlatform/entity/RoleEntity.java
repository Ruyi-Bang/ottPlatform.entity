package RuyiBang.ottPlatform.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "roles")
@Data // generates getters, setters, toString, equals, hashCode
@NoArgsConstructor // creates a no-arg constructor
@AllArgsConstructor // creates an all-args constructor
@Builder
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name; // e.g., ROLE_ADMIN, ROLE_USER

    // getters and setters
}

