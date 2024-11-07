class Team {
    private String name;
    private int mundialsNum;

    // setter
    public Team(String name, int num) {
        this.name = name;
        this.mundialsNum = num;
    }

    // getter
    public String getTeamName() {
        return this.name;
    }

    public int getTeamMundialNum() {
        return this.mundialsNum;
    }

    // inc
    public void IncMundialNumb() {
        this.mundialsNum++;
    }
}