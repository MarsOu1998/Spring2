package UserDao;

import Interface.IDAO;

public class userDao implements IDAO {

    @Override
    public void Login(String account,String password) {
        System.out.println("用户登录:"+account+" "+password);
    }
}
