package com.example.demo1;

public class Employee
{

    private int id;
    private String name;
    private String surname;
    private String birthdate;
    private String country;
    private String phoneNumber;
    private String email;
    private boolean isDeleted = false;

    public String getBirthdate()
    {
        return birthdate;
    }

    public void setBirthdate(String birthdate)
    {
        this.birthdate = birthdate;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public boolean getIsDeleted()
    {
        return isDeleted;
    }

    public void setIsDeleted(boolean deleted)
    {
        isDeleted = deleted;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    @Override
    public String toString()
    {
        return "id " + id +
                "\n[" + name +
                " " + surname +
                "; birthdate: " + birthdate +
                "; email: " + email +
                ";\ncountry: " + country +
                "; phoneNumber: " + phoneNumber + "]\n\n";
    }
}