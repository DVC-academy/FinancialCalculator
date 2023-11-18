package com.dvc.financialcalculator;

public class Calculator {

    private int numberOfSchools;
    private int numberOfGroups;
    private int numberOfStudentsInAGroup;
    private int creditPerStudent;
    private int numberOfSessionsAWeek;


    public Calculator(int numberOfSchools,
                      int numberOfGroups,
                      int numberOfStudentsInAGroup,
                      int numberOfSessionsAWeek,
                      int creditPerStudent) {
        this.numberOfSchools = numberOfSchools;
        this.numberOfGroups = numberOfGroups;
        this.numberOfStudentsInAGroup = numberOfStudentsInAGroup;
        this.numberOfSessionsAWeek = numberOfSessionsAWeek;
        this.creditPerStudent = creditPerStudent;
    }

    //region Getters and setters

    public int getNumberOfSchools() {
        return numberOfSchools;
    }

    public void setNumberOfSchools(int numberOfSchools) {
        this.numberOfSchools = numberOfSchools;
    }

    public int getNumberOfGroups() {
        return numberOfGroups;
    }

    public void setNumberOfGroups(int numberOfGroups) {
        this.numberOfGroups = numberOfGroups;
    }

    public int getNumberOfStudentsInAGroup() {
        return numberOfStudentsInAGroup;
    }

    public void setNumberOfStudentsInAGroup(int numberOfStudentsInAGroup) {
        this.numberOfStudentsInAGroup = numberOfStudentsInAGroup;
    }

    public int getNumberOfSessionsAWeek() {
        return numberOfSessionsAWeek;
    }

    public void setNumberOfSessionsAWeek(int numberOfSessionsAWeek) {
        this.numberOfSessionsAWeek = numberOfSessionsAWeek;
    }

    public int getCreditPerStudent() {
        return creditPerStudent;
    }

    public void setCreditPerStudent(int creditPerStudent) {
        this.creditPerStudent = creditPerStudent;
    }

    //endregion

    public int calculateMonthlyRevenue() {
        return 4 * this.creditPerStudent * this.numberOfSessionsAWeek * this.numberOfStudentsInAGroup * this.numberOfGroups * this.numberOfSchools;
        //todo: remove hardcoded string
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "numberOfSchools=" + numberOfSchools +
                ", numberOfGroups=" + numberOfGroups +
                ", numberOfStudentsInAGroup=" + numberOfStudentsInAGroup +
                ", creditPerStudent=" + creditPerStudent +
                '}';
    }
}
