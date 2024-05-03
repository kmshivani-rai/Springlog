package Javaproject.example.Newjava.Entity;

import jakarta.persistence.*;

@Entity
@Table( name="stdinfo")
public class Studentinfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String name1;
    private String lastname;
    private String email;
    private String fathername;
    private String mothername;
    private String address;
    private  String schoolname;
    private String classname;

    public Long getId() {
        return id;
    }

    public String getName1() {
        return name1;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getFathername() {
        return fathername;
    }

    public String getMothername() {
        return mothername;
    }

    public String getAddress() {
        return address;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public String getClassname() {
        return classname;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public void setMothername(String mothername) {
        this.mothername = mothername;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }
}
