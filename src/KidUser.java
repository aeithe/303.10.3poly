public class KidUser implements LibraryUser{
    private int age;
    private String bookType;

    public KidUser(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }


    @Override
    public void registerAccount() {
        if(this.age <= 11 && this.age >= 0){
            System.out.println("You have successfully registered under a Kids Account");
        }else if(this.age > 11){
            System.out.println("Sorry, age must be less than 12 to register as a kid.");
        }else{
            System.out.println("Invalid age");
        }
    }

    @Override
    public void requestBook() {
        if(this.bookType.toLowerCase().equals("kids")){
            System.out.println("Book issued successfully, please return within 10 days");
        }else {
            System.out.println("Oops, you are allowed to take only kids books");
        }
    }
}