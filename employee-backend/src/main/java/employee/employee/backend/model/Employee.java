package employee.employee.backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
@Id
  @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
  @Column(name="username")
    private String username;
  @Column(name="email")
    private  String email;
  @Column(name="password")
    private String password;
  @Column(name="published")
  private boolean published;

    public Employee(String username, String email, String password, boolean b) {
    }

    public Employee() {

    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public Employee(String username, String email, String password) {
    }

    public Employee(Long id, String username, String email, String password) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString(){
        return "Employee{" +
                "id"+id+", username='"+ username + '\'' +
                ",email='"+email + '\'' + ",password='"+password +  '\'' +",published"+ published + '\''+ '}';


    }
}
