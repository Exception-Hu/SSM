package com.shop.po;

public class Scores {
    private String studentId;

    private String subjectId;

    private Double score;

    private Double ssssss;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId == null ? null : subjectId.trim();
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Double getSsssss() {
        return ssssss;
    }

    public void setSsssss(Double ssssss) {
        this.ssssss = ssssss;
    }
}