import java.time.LocalDate;
import java.time.Period;

public class Elnura {


        private Long id;

        private String name;

        private String email;

        private LocalDate dob;


        private Integer  age;


        public Elnura() {
        }

        public Elnura(
                Long id,
                String name,
                String email,
                LocalDate dod) {
            this.id = id;
            this.name = name;
            this.email = email;
            this.dob = dod;
        }

        public Elnura(
                String name,
                String email,
                LocalDate dod) {
            this.name = name;
            this.email = email;
            this.dob = dod;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public LocalDate getDob() {
            return dob;
        }

        public void setDob(LocalDate dod) {
            this.dob = dod;
        }

        public Integer getAge() {
            return Period.between(this.dob,LocalDate.now()).getYears() ;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    ", dod=" + dob +
                    ", age=" + age +
                    '}';
        }
    }


