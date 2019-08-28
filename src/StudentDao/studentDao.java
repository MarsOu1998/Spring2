package StudentDao;

import Interface.IDAO;

public class studentDao implements IDAO {
    @Override
    public void Login(String account,String password) {
        System.out.println("学生登录:"+account+" "+password);
    }
}
