package lombokexperiments;

import lombokexperiments.dto.User;
import lombokexperiments.dto.UserLombok;
import lombokexperiments.dto.UserWith;


public class MainLombok {

    public static void main(String[] args) {
        User user = new User("aaa", "ksdik");
        System.out.println("User: " + user.getName());

        UserWith userWith = new UserWith();
        userWith.withName("sss");
        userWith.withPassword("dhgs");
        System.out.println(userWith.getPassword() + " user with");

        UserWith userWith1 = new UserWith().withName("aaaa")
                .withPassword("fkeihuf");
        System.out.println("UserWith1 " + userWith1.getName());

        UserWith userWith2 = new UserWith().withPassword("123hydgd");


        //========= Lombok
        UserLombok userLombok = UserLombok.builder()
                .name("John")
                .password("fhg").build();

        System.out.println("lombok: " + userLombok.getName());



    }
}
