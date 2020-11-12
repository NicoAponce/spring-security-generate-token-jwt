package project.spring.securitycourse.entities;import lombok.*;import javax.persistence.*;@Getter@Setter@AllArgsConstructor@NoArgsConstructor@Builder@Entity@Table(name = "users")public class User {    @Id    @GeneratedValue(strategy = GenerationType.IDENTITY)    @Column(name = "id")    private Long id;    @Column(name = "username")    private String username;    @Column(name = "password")    private String password;    @Column(name = "email")    private String email;}