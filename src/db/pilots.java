package db;

public class pilots {

    private int id;
    private String name;
    private String last_name;
    private String rank;
    private String pilot_code;

    public pilots(int id, String name, String last_name, String rank, String pilot_code) {
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

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
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
        return "pilots{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", rank='" + rank + '\'' +
                ", pilot_code='" + pilot_code + '\'' +
                '}';
    }
}
