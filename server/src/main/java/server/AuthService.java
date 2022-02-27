package server;

public interface AuthService {
    /*
    * Метож для получения никнейма по лоигну и паролю
    * null учетки нет
    * nick если учетка найдена
    * */
    String getNicknameByLoginAndPassword(String login, String password);

}
