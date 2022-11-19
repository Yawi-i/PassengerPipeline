package ie.atu;

public class Passenger {
    private String title;
    private String name;
    private long id;
    private long phone;
    private int age;

    public Passenger(String title, String name, long id, long phone, int age) {
        setTitle(title);
        setName(name);
        setId(id);
        setPhone(phone);
        setAge(age);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if("Mr".equalsIgnoreCase(title) || "Mrs".equalsIgnoreCase(title) || "Ms".equalsIgnoreCase(title)){
            this.title = title;
        }
        else {
            throw new IllegalArgumentException("This is not a valid name. Use Mr, Ms or Mrs.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 3){
            this.name = name;
        }
        else{
            throw new IllegalArgumentException("This is not a valid name.");
        }
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        if(String.valueOf(id).length() >= 10){
            this.id = id;
        }
        else{
            throw new IllegalArgumentException("This is not a valid ID.");
        }
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        if(String.valueOf(phone).length() >= 7){
            this.phone = phone;
        }
        else{
            throw new IllegalArgumentException("This is not a valid phone number.");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 16){
            this.age = age;
        }
        else{
            throw new IllegalArgumentException("You must be over 16.");
        }
    }

}