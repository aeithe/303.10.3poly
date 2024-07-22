public class AdultUser implements LibraryUser{
    private int age;
    private String bookType;

    public AdultUser(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    @Override
    public void registerAccount() {
        if(this.age >= 12){
            System.out.println("You have successfully registered under an adult account");
        }else if(this.age < 11 && this.age > 0){
            System.out.println("Sorry, age must be greater than 12 to register as an Adult");
        }else {
            System.out.println("Invalid age");
        }
    }

    @Override
    public void requestBook() {
        if(this.bookType.toLowerCase().equals("fiction")){
            System.out.println("Book issued successfully, please return within 7 days");
        }else{
            System.out.println("Oops, you are allowed to take only adult fiction books");
        }
    }
}