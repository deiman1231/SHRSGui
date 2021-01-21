package DataTypes;

import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleStringProperty;

public class Patient {
    private final StringProperty name = new SimpleStringProperty(this, "Name");
    private final StringProperty username = new SimpleStringProperty(this, "username");
    private final StringProperty password = new SimpleStringProperty(this, "password");
    private final StringProperty email = new SimpleStringProperty(this, "email");

    public Patient(String name, String username, String password, String email){
        setName(name);
        setUsername(username);
        setPassword(password);
        setEmail(email);
    }


    public StringProperty NameProperty() {
        return name;
    }

    public void setName(String newName){
        name.set(newName);
    }

    public StringProperty getUsernameProperty() {
        return username;
    }

    public void setUsername(String newName){
        username.set(newName);
    }

    public StringProperty getPasswordProperty() {
        return password;
    }

    public void setPassword(String newName){
        password.set(newName);
    }

    public StringProperty getEmailProperty() {
        return email;
    }

    public void setEmail(String newName){
        email.set(newName);
    }
}
