package hashcode;

class Team {

    private static final int HASH_PRIME = 1000003;
    private              String name;
    private              int wins;
    private              int losses;


    public Team(String name) {
        this.name = name;
    }

    public Team(String name, int wins, int losses) {
        this.name = name;
        this.wins = wins;
        this.losses = losses;
    }


    /**
     * this overrides equals() in java.lang.Object
     */
    public boolean equals(Object obj) {
        /**
         * return true if they are the same object
         */
        if (this == obj)
            return true;

        /**
         * the following two tests only need to be performed
         * if this class is directly derived from java.lang.Object
         */
        if (obj == null || obj.getClass() != getClass())
            return false;

        // we know obj is of type Team
        Team other = (Team)obj;

        // now test all pertinent fields ...
        if (wins != other.wins || losses!= other.losses) {
            return false;
        }
        
        if (!name.equals(other.name)) {
            return false;
        }

        // otherwise they are equal
        return true;
    }


    /**
     * This overrides hashCode() in java.lang.Object
     */
    public int hashCode() {
        int result = 0;

        result = HASH_PRIME * result + wins;
        result = HASH_PRIME * result + losses;
        result = HASH_PRIME * result + name.hashCode();

        return result;
    }

}
