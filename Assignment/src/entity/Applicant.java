/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import adt.SortedDoublyLinkedList;
import adt.SortedListInterface;

/**
 *
 * @author Acer
 */
public class Applicant implements Comparable<Applicant> {

    private String userID;
    private String name;
    private String email;
    private int age;
    private SortedListInterface<String> skills = new SortedDoublyLinkedList<>();
    private SortedListInterface<String> workingExperience = new SortedDoublyLinkedList<>();
    private SortedListInterface<String> education = new SortedDoublyLinkedList<>();
    private SortedListInterface<Application> application = new SortedDoublyLinkedList<>();

    public Applicant(String userID, String name, String email, int age, SortedListInterface<String> skills, SortedListInterface<String> workingExperience, SortedListInterface<String> education, SortedListInterface<Application> application) {
        this.userID = userID;
        this.name = name;
        this.email = email;
        this.age = age;
        this.skills = skills;
        this.workingExperience = workingExperience;
        this.education = education;
        this.application = application;
    }

    public Applicant(String userID, String name, String email, int age, SortedListInterface<String> skills, SortedListInterface<String> workingExperience, SortedListInterface<String> education) {
        this.userID = userID;
        this.name = name;
        this.email = email;
        this.age = age;
        this.skills = skills;
        this.workingExperience = workingExperience;
        this.education = education;

    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public SortedListInterface<String> getSkills() {
        return skills;
    }

    public void setSkills(SortedListInterface<String> skills) {
        this.skills = skills;
    }

    public SortedListInterface<String> getWorkingExperience() {
        return workingExperience;
    }

    public void setWorkingExperience(SortedListInterface<String> workingExperience) {
        this.workingExperience = workingExperience;
    }

    public SortedListInterface<String> getEducation() {
        return education;
    }

    public void setEducation(SortedListInterface<String> education) {
        this.education = education;
    }

    public SortedListInterface<Application> getApplication() {
        return application;
    }

    public void setApplication(SortedListInterface<Application> application) {
        this.application = application;
    }

    @Override
    public int compareTo(Applicant other) {
        return this.userID.compareTo(other.userID); // Compare by userID
    }

    @Override
    public String toString() {
        return "UserID: " + userID + "\n"
                + "Name: " + name + "\n"
                + "Email: " + email + "\n"
                + "Age: " + age + "\n"
                + "Skills: " + skills + "\n"
                + "Working Experience: " + workingExperience + "\n"
                + "Education: " + education + "\n";
    }

}
