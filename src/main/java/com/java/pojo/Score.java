package com.java.pojo;

/**
 * @author zhuhongbo
 * @create 2021-07-09-14:53
 */
public class Score {
    private String id;
    private String classId;
    private Integer score;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Score{" +
                "id='" + id + '\'' +
                ", classId='" + classId + '\'' +
                ", score=" + score +
                '}';
    }
}
