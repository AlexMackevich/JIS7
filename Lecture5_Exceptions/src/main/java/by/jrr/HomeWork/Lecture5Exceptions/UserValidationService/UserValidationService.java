package by.jrr.HomeWork.Lecture5Exceptions.UserValidationService;
//***********cheched***********
public class UserValidationService {

    public void validateUserName(User user){

        int firstNameLength = Integer.parseInt(user.getFirstName());
        int lastNameLength = Integer.parseInt(user.getLastName());
        int age = user.getAge();

        if (firstNameLength >= 3 && firstNameLength <= 15 & lastNameLength >=3 && lastNameLength <= 15){
            System.out.println("Валидация успешно");
        }else throw new UserValidationException ("Имя не соотвствует мнимальную или максимальному значению имени");

        if (age  > 0 & age < 120){
            System.out.println("Валидация успешно");
        }else throw new UserValidationException("Возраст не соответствует минимальному или максимальному значению возраста");
    }
}

//Метод называется userValidationName а валидирует и имя и возраст. Для разработчика это неочевидно и может сконфузить. Раздели метод на два. Для валидации имени и возраста отдельно.
//А еще в методах валидации принято первое слово использовать validateUserName например
