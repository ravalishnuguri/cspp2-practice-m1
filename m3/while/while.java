final class while1 {
    /**
     * Constructs the object.
     **/
    private while1() { }
    /**
     * function_description.
     *
     * @param      args  The arguments.
     **/
    public static void main(final String[] args) {
        int i = 2;
        while(i<=10){
            System.out.println(i);
            i = i+2;
            if (i>10){
                System.out.println("GoodBye!");
            }
        }

    }
}