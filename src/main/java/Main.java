public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "4444 № 44444444";
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Иванов";
        post.subscription = Boolean.valueOf("true");

        post.birthday = new FormDate();
        int day = Integer.parseInt("13");
        int month = Integer.parseInt("6");
        int year = Integer.parseInt("1999");
    }
}
