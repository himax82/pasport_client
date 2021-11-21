package org.example.domain;

import java.sql.Date;

public class Pasport {

    private int id;

    @Override
    public String toString() {
        return "Pasport{"
                 + "id=" + id + ", name='" + name + '\''
                + ", surname='" + surname + '\''
                + ", patronymic='" + patronymic + '\''
                + ", birthday=" + birthday
                + ", dateOfIssue=" + dateOfIssue
                + ", series=" + series
                + ", number=" + number
                + ", registration='" + registration + '\'' + '}';
    }

    private String name;
    private String surname;
    private String patronymic;
    private Date birthday;
    private Date dateOfIssue;
    private int series;
    private int number;
    private String registration;

    public Pasport(String name, String surname, String patronymic, Date birthday,
                   Date dateOfIssue, int series, int number, String registration) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.dateOfIssue = dateOfIssue;
        this.series = series;
        this.number = number;
        this.registration = registration;
    }

    public Pasport() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public Date getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(Date dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }
}
