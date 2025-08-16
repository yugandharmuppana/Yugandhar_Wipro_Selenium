package Day6_assignment;

enum CompassDirection {
    NORTH, SOUTH, EAST, WEST;
}

class CompassDemo {
    public static void main(String[] args) {
        for (CompassDirection direction : CompassDirection.values()) {
            System.out.println(direction + " at position " + direction.ordinal());
        }
    }
}