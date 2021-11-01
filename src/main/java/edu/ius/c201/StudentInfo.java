package edu.ius.c201;

public class StudentInfo {
    private double maxGrade;

    private double[] grades;
    private String[] names;

    public StudentInfo(double maxGrade, int totalStudents) {
        this.grades = new double[totalStudents];
        this.names = new String[totalStudents];
        this.maxGrade = maxGrade;
    }

    public double getGrade(int id) {
        return grades[id];
    }

    public String getName(int id) {
        return names[id];
    }

    public void setGrade(int id, double newGrade) {
        grades[id] = newGrade;
    }

    public void setName(int id, String newName) {
        names[id] = newName;
    }

    public double getGradeByName(String name) {
        for (int i = 0; i < grades.length; i++) {
            if (names[i] == name) {
                return grades[i];
            }
        }
        return -1;
    }

    public void setGradeByName(String name, double grade) {
        for (int i = 0; i < grades.length; i++) {
            if (names[i] == name) {
                grades[i] = grade;
            }
        }
    }

    public int numBestGrades() {
        int count = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= 50 && grades[i] <= maxGrade) {
                count++;
            }
        }
        return count;
    }

    public String[] findBestStudents() {
        String[] best = new String[numBestGrades()];
        int j = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= 50 && grades[i] <= maxGrade) {
                best[j] = names[i];
                j++;
            }
        }
        return best;
    }
}
