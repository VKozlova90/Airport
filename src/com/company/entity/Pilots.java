package com.company.entity;

public class Pilots {

    private int id;
    private String name;
    private String last_name;
    private Rank p_rank;
    private String pilot_code;

    public Pilots(int id, String name, String last_name, Rank p_rank, String pilot_code) {
        this.id = id;
        this.name = name;
        this.last_name = last_name;
        this.p_rank = p_rank;
        this.pilot_code = pilot_code;
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

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Rank getP_rank() {
        return p_rank;
    }

    public void setP_rank(Rank p_rank) {
        this.p_rank = p_rank;
    }

    public String getPilot_code() {
        return pilot_code;
    }

    public void setPilot_code(String pilot_code) {
        this.pilot_code = pilot_code;
    }

    @Override
    public String toString() {
        return "Pilots{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", p_rank=" + p_rank +
                ", pilot_code='" + pilot_code + '\'' +
                '}';
    }

    /* public Pilots(int id, String name, String last_name, Rank rank, String pilot_code) {
        this.id = id;
        this.name = name;
        this.last_name = last_name;
        this.rank = rank;
        this.pilot_code = pilot_code;
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

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public String getPilot_code() {
        return pilot_code;
    }

    public void setPilot_code(String pilot_code) {
        this.pilot_code = pilot_code;
    }

    @Override
    public String toString() {
        return "Pilots{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", rank=" + rank +
                ", pilot_code='" + pilot_code + '\'' +
                '}';
    }*/
}
