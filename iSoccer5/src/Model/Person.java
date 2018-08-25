package Model;

public class Person {
    protected String name;
    protected String email;
    protected String cpf;
    protected String telephone;

    public Person(String name, String email, String cpf, String telephone) {
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.telephone = telephone;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "(CPF: " + this.cpf + ")\n" +
                "E-mail: " + this.email + "\n" +
                "Telephone: " + this.telephone + "\n";
    }
}
